package com.aryaman.realestate.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.aryaman.realestate.entities.ProjectDetails;
import com.aryaman.realestate.model.ProjectDetailsDTO;
import com.aryaman.realestate.repository.ProjectDetailsRepo;
import com.aryaman.realestate.utils.StorageService;

@Service
public class ProjectDetailsService {
	
	@Autowired private ProjectDetailsRepo repo;
	@Autowired private BuilderService bserv;
	@Autowired private StorageService storageService;
	
	public void saveProjectDetails(ProjectDetailsDTO dto) {
		System.out.println(dto);
		ProjectDetails projectDetails = new ProjectDetails();
		BeanUtils.copyProperties(dto, projectDetails);
		String photo = storageService.store(dto.getPhoto());
		projectDetails.setPhoto(photo);
		repo.save(projectDetails);		
	}
	
	public void updateProjectDetails(int id, ProjectDetailsDTO dto) {
		ProjectDetails projectDetails = repo.getById(id);
		projectDetails.setPrice(dto.getPrice());
		projectDetails.setProjectName(dto.getProjectName());
		projectDetails.setBuilder(dto.getBuilder());
		repo.save(projectDetails);
	}
	
	public List<ProjectDetails>listAll(){
		return repo.findAll(Sort.by(Direction.DESC,"id"));
	}
	
	public List<ProjectDetails> listByBuilder(int id){
		return repo.findByBuilder(bserv.findById(id));
	}
	public void deleteProjectDetails(int id) {
		repo.delete(repo.getById(id));
	}
	public ProjectDetails findById(int id) {
		return repo.getById(id);
	}

}
