package com.aryaman.realestate.controller;

import java.util.List;

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

import com.aryaman.realestate.model.PropertyDTO;
import com.aryaman.realestate.service.PropertyService;

@CrossOrigin
@RestController
@RequestMapping("/api/property")
public class PropertyController {
	
	@Autowired private PropertyService propertyService;
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody PropertyDTO dto) {		
		propertyService.saveProperty(dto);
		return ResponseEntity.ok("Property saved successfully");
	}
	
	@GetMapping
	public ResponseEntity<?> findAll() {		
		return ResponseEntity.ok(propertyService.listAll());
	}
	
	@GetMapping("/projectdetails/{id}")
	public ResponseEntity<List> findById(@PathVariable("id") int id) {		
		return ResponseEntity.ok(propertyService.listProjectDetails(id));
	}
	
	@GetMapping("/search/{id}")
	public ResponseEntity<?> findById(@PathVariable("id") String id) {		
		return ResponseEntity.ok(propertyService.findById(id));
	}
	
	@GetMapping("/filter/{city}")
	public ResponseEntity<?> filterByCity(@PathVariable("city") String city) {		
		return ResponseEntity.ok(propertyService.listCity(city));
	}
	
	@GetMapping("/find/{noOfRooms}")
	public ResponseEntity<?> filterByNumberOfRooms(@PathVariable("noOfRooms") String noOfRooms) {		
		return ResponseEntity.ok(propertyService.listNoOfRooms(noOfRooms));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteById(@PathVariable("id") String id) {
		System.out.println(id);
		propertyService.deleteProperty(id);
		return ResponseEntity.ok("Property deleted successfully");
	}

}
