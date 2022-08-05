package com.aryaman.realestate.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.aryaman.realestate.entities.Property;
import com.aryaman.realestate.model.PropertyDTO;
import com.aryaman.realestate.repository.PropertyRepo;

@Service
public class PropertyService {
	
	@Autowired private PropertyRepo prepo;
	@Autowired private ProjectDetailsService pdsrv;
	
	
	@SuppressWarnings("deprecation")
	public void saveProperty(PropertyDTO dto) {
		Property property =new Property();
		if(prepo.existsById(dto.getId())) {
			property=prepo.getById(dto.getId());
		}
		BeanUtils.copyProperties(dto, property);
		property.setProjectDetails(pdsrv.findById(dto.getprojid()));
		prepo.save(property);
	}
	
	public void updateProperty(Property prop) {
		prepo.save(prop);
	}
	
	public List<Property> listAll(){
		return prepo.findAll(Sort.by(Direction.DESC,"postedon"));
	}
	
	public Property findById(String id) {
		return prepo.getById(id);
	}
	
	public List<Property> listProjectDetails(int bid){
		return prepo.findByProjectDetails(pdsrv.findById(bid));
	}
	
	public List<Property> listCity(String city){
		return prepo.findByCity(city);
	}
	
	public List<Property> listNoOfRooms(String norms){
		return prepo.findByNoOfRooms(norms);
	}
	
	@SuppressWarnings("deprecation")
	public void deleteProperty(String id) {
		if(prepo.existsById(id)) {
			prepo.delete(prepo.getById(id));
		}
	}
	

}
