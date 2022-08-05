package com.aryaman.realestate.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@DynamicInsert
@DynamicUpdate
public class Property {
	
	@Id
	private String id;
	private String noOfRooms;
	private String area;
	private String status;
	@ManyToOne
	@JoinColumn(name="projectdetails_id")
	private ProjectDetails projectDetails;
	private boolean isDeleted;
	private LocalDateTime postedon;
	private String city;
	
	
	public Property() {
		this.postedon=LocalDateTime.now();
		this.isDeleted=false;
		this.status="Available";
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNoOfRooms() {
		return noOfRooms;
	}


	public void setNoOfRooms(String noOfRooms) {
		this.noOfRooms = noOfRooms;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public ProjectDetails getProjectDetails() {
		return projectDetails;
	}


	public void setProjectDetails(ProjectDetails projectdetails) {
		this.projectDetails = projectdetails;
	}


	public boolean isDeleted() {
		return isDeleted;
	}


	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	

	public LocalDateTime getPostedon() {
		return postedon;
	}


	public void setPostedon(LocalDateTime postedon) {
		this.postedon = postedon;
	}
	
	

	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Property [id=" + id + ", noOfRooms=" + noOfRooms + ", area=" + area + ", status=" + status
				+ ", projectDetails=" + projectDetails + ", isDeleted=" + isDeleted + ", postedon=" + postedon
				+ ", city=" + city + "]";
	}
	
	



	
	
	
	

}
