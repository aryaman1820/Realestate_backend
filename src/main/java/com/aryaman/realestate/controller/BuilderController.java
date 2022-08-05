package com.aryaman.realestate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aryaman.realestate.entities.Builder;
import com.aryaman.realestate.service.BuilderService;

@CrossOrigin
@RestController
@RequestMapping("/api/builders")
public class BuilderController {
	@Autowired private BuilderService builderService;
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Builder request){
		builderService.saveBuilder(request);
		return ResponseEntity.ok("Builder registered sucessfully");
	}
	
	@GetMapping
	public ResponseEntity<?> findAll() {		
		return ResponseEntity.ok(builderService.listAll());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteById(@PathVariable("id") int id) {
		builderService.deleteBuilder(id);
		return ResponseEntity.ok("Builder Deleted successfully");
	}
}
