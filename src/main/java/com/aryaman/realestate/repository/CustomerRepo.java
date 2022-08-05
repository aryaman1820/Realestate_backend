package com.aryaman.realestate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aryaman.realestate.entities.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,String>  {

}
