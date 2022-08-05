package com.aryaman.realestate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aryaman.realestate.model.AppointmentCompleteDTO;
import com.aryaman.realestate.model.AppointmentDTO;
import com.aryaman.realestate.model.AppointmentStatusDTO;
import com.aryaman.realestate.service.AppointmentService;

@CrossOrigin
@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {
	
	@Autowired private AppointmentService appointmentService;
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody AppointmentDTO dto) {		
		appointmentService.saveAppointment(dto);
		return ResponseEntity.ok("Appointment successful");
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateStatus(@PathVariable("id") int id,@RequestBody AppointmentStatusDTO dto) {
		dto.setApid(id);
		appointmentService.updateBooking(dto);
		return ResponseEntity.ok("Appointment Confirmed");
	}
	
	@PutMapping("/complete/{id}")
	public ResponseEntity<?> completeBooking(@PathVariable("id") int id,@RequestBody AppointmentCompleteDTO dto) {
		dto.setApid(id);
		appointmentService.completeAppointment(dto);
		return ResponseEntity.ok("Appointment Completed");
	}
	
	@GetMapping
	public ResponseEntity<?> findAll() {		
		return ResponseEntity.ok(appointmentService.findAllAppointments());
	}
	
	@GetMapping("/users")
	public ResponseEntity<?> findCustomerAppointments(String userid) {		
		return ResponseEntity.ok(appointmentService.findUserAppointments(userid));
	}
	
	@GetMapping("/feedbacks")
	public ResponseEntity<?> allFeedbacks() {		
		return ResponseEntity.ok(appointmentService.allFeedbacks());
	}
	
	@GetMapping("/payments/{id}")
	public ResponseEntity<?> findAllPayments(@PathVariable("id") int id) {		
		return ResponseEntity.ok(appointmentService.findBookingPayments(id));
	}
	
	@GetMapping("/payments")
	public ResponseEntity<?> findallPayments() {		
		return ResponseEntity.ok(appointmentService.findAllPayments());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable("id") int id) {		
		return ResponseEntity.ok(appointmentService.findById(id));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteById(@PathVariable("id") int id) {
		appointmentService.cancelAppointment(id);
		return ResponseEntity.ok("Appointment cancelled successfully");
	}
}
