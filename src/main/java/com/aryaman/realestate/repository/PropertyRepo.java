package com.aryaman.realestate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aryaman.realestate.entities.ProjectDetails;
import com.aryaman.realestate.entities.Property;

@Repository
public interface PropertyRepo extends JpaRepository<Property, String> {
	
	List<Property> findByCity(String city);
	List<Property> findByNoOfRooms(String noOfRooms);
	List<Property> findByProjectDetails(ProjectDetails projectdetails);
	List<Property> findByStatus(String status);

}
