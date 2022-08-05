package com.aryaman.realestate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.aryaman.realestate.entities.Builder;
import com.aryaman.realestate.repository.BuilderRepo;

@Service
public class BuilderService {
	
	@Autowired
	private BuilderRepo repo;
	
	public void saveBuilder(Builder build) {
		repo.save(build);
	}
	
	public List<Builder> listAll(){
		return repo.findAll(Sort.by(Direction.DESC,"id"));
	}
	
	public void deleteBuilder(int id) {
		repo.delete(repo.getById(id));
	}
	
	public Builder findById(int id) {
		return repo.getById(id);
	}

}
