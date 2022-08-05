package com.aryaman.realestate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aryaman.realestate.entities.Customer;
import com.aryaman.realestate.entities.Feedback;

@Repository
public interface FeedbackRepo extends JpaRepository<Feedback, Integer> {
	
	List<Feedback> findByCustomer(Customer customer);

}
