package com.aryaman.realestate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aryaman.realestate.entities.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, String> {

}
