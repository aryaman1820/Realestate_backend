package com.aryaman.realestate.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.aryaman.realestate.entities.Appointment;
import com.aryaman.realestate.entities.Customer;
import com.aryaman.realestate.entities.Feedback;
import com.aryaman.realestate.entities.Payment;
import com.aryaman.realestate.entities.ProjectDetails;
import com.aryaman.realestate.entities.Property;
import com.aryaman.realestate.model.AppointmentCompleteDTO;
import com.aryaman.realestate.model.AppointmentDTO;
import com.aryaman.realestate.model.AppointmentStatusDTO;
import com.aryaman.realestate.repository.AppointmentRepo;
import com.aryaman.realestate.repository.FeedbackRepo;
import com.aryaman.realestate.repository.PaymentRepo;

@Service
public class AppointmentService {
	@Autowired private AppointmentRepo aprepo;
	@Autowired private PaymentRepo payrepo;
	@Autowired private CustomerService csrv;
	@Autowired private ProjectDetailsService pdsrv;
	@Autowired private PropertyService propsrv;
	@Autowired private FeedbackRepo frepo;
	
	public void saveAppointment(AppointmentDTO dto) {
		System.out.println(dto);
		Customer customer = csrv.findByUserId(dto.getUserid());
		ProjectDetails projectDetails=pdsrv.findById(dto.getProjid());
		
		Appointment bk=new Appointment();
		BeanUtils.copyProperties(dto, bk);
		bk.setCustomer(customer);
		bk.setProjectdetails(projectDetails);
		System.out.println(bk);
		aprepo.save(bk);
		
		Payment pmt=new Payment();
		BeanUtils.copyProperties(dto, pmt);
		pmt.setRemarks("Booking Amount");
		pmt.setAppointment(bk);
		pmt.setAmount(dto.getBookingAmount());
		System.out.println(pmt);
		payrepo.save(pmt);
	}
	
	public void updateBooking(AppointmentStatusDTO dto) {
		Appointment bk=findById(dto.getApid());
		Property bik=propsrv.findById(dto.getApno());
		bk.setProperty(bik);
		bk.setStatus("Confirmed");
		aprepo.save(bk);
		
		bik.setStatus("Not Available");
		propsrv.updateProperty(bik);
	}
	public void completeAppointment(AppointmentCompleteDTO dto) {
		Appointment bk=findById(dto.getApid());
		
		Property property=bk.getProperty();
		property.setStatus("Available");
		propsrv.updateProperty(property);		
		
		Payment pmt=new Payment();
		pmt.setAmount(dto.getAmount());
		pmt.setAppointment(bk);
		pmt.setNameOnCard(dto.getNameOnCard());
		pmt.setCardno(dto.getCardno());
		pmt.setRemarks("Payment completed");
		pmt.setCompleted(true);
		payrepo.save(pmt);
		
		Feedback fb=new Feedback();
		fb.setCustomer(bk.getCustomer());
		fb.setDescr(dto.getFeedback());
		fb.setRatings(dto.getRating());
		
		frepo.save(fb);
	}
	public List<Feedback> allFeedbacks(){
		return frepo.findAll(Sort.by(Direction.DESC, "id"));
	}
	
	public void cancelAppointment(int id) {
		List<Payment> pmts=payrepo.findByAppointment(aprepo.getById(id));
		payrepo.deleteAll(pmts);
		aprepo.delete(aprepo.getById(id));
	}
	
	public Appointment findById(int id) {
		return aprepo.getById(id);
	}
	
	public List<Appointment> findAllAppointments(){
		return aprepo.findAll(Sort.by(Direction.DESC, "id"));
	}
	
	public List<Payment> findAllPayments(){
		return payrepo.findAll(Sort.by(Direction.DESC, "id"));
	}
	
	public List<Appointment> findUserAppointments(String userid){
		return aprepo.findByCustomer(csrv.findByUserId(userid));
	}
	
	public List<Payment> findBookingPayments(int id){
		return payrepo.findByAppointment(aprepo.getById(id));
	}
	
	

}
