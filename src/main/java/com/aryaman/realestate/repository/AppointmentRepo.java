package com.aryaman.realestate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aryaman.realestate.entities.Appointment;
import com.aryaman.realestate.entities.Customer;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Integer> {
	
	List<Appointment> findByCustomer(Customer customer); 

}
