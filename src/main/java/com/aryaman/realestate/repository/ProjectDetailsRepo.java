package com.aryaman.realestate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aryaman.realestate.entities.Builder;
import com.aryaman.realestate.entities.ProjectDetails;

@Repository
public interface ProjectDetailsRepo extends JpaRepository<ProjectDetails, Integer> {
	
	List<ProjectDetails> findByBuilder(Builder builder);

}
