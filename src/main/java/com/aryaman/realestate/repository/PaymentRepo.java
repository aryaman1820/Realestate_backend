package com.aryaman.realestate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aryaman.realestate.entities.Appointment;
import com.aryaman.realestate.entities.Payment;

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Integer> {
	
	List<Payment> findByAppointment(Appointment appointment);

}
