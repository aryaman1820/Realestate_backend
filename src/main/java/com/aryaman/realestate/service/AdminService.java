package com.aryaman.realestate.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aryaman.realestate.entities.Admin;
import com.aryaman.realestate.repository.AdminRepo;

@Service
public class AdminService {
	
	@Autowired
	AdminRepo adminRepo;
	
	public Admin validate(String userid, String pwd) {
		
		Optional<Admin> admin = adminRepo.findById(userid);
		if(admin.isPresent()&& admin.get().getPwd().equals(pwd)) {
			return admin.get();
		}
		return null;
	}
	
	@SuppressWarnings("deprecation")
	public void updateAdmin(Admin admin) {
		if(admin.getPwd().equals("") || admin.getPwd()==null) {
			admin.setPwd(adminRepo.getById(admin.getUserid()).getPwd());
		}
		adminRepo.save(admin);
	}
	
	public long countAdmin() {
		return adminRepo.count();
	}
	

}
