package com.aryaman.realestate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aryaman.realestate.entities.Builder;

@Repository
public interface BuilderRepo extends JpaRepository<Builder, Integer> {

}
