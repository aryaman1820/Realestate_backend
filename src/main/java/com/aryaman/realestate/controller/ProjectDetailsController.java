package com.aryaman.realestate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aryaman.realestate.model.ProjectDetailsDTO;
import com.aryaman.realestate.service.ProjectDetailsService;

@CrossOrigin
@RestController
@RequestMapping("/api/projectdetails")
public class ProjectDetailsController {
	@Autowired private ProjectDetailsService prodservice;
	
	@PostMapping
	public ResponseEntity<?> save(ProjectDetailsDTO dto) {		
		prodservice.saveProjectDetails(dto);
		return ResponseEntity.ok("Project Details registered successfully");
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> save(@PathVariable("id") int id,ProjectDetailsDTO  dto) {		
		prodservice.updateProjectDetails(id,dto);
		return ResponseEntity.ok("Project Details updated successfully");
	}
	
	@GetMapping
	public ResponseEntity<?> findAll() {		
		return ResponseEntity.ok(prodservice.listAll());
	}
	
	@GetMapping("/builder/{id}")
	public ResponseEntity<?> findAll(@PathVariable("id") int id) {		
		return ResponseEntity.ok(prodservice.listByBuilder(id));
	}
	
	@GetMapping("/{id}")  
	public ResponseEntity<?> findById(@PathVariable("id") int id) {		
		return ResponseEntity.ok(prodservice.findById(id));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteById(@PathVariable("id") int id) {
		prodservice.deleteProjectDetails(id);
		return ResponseEntity.ok("Deleted successfully");
	}

}
