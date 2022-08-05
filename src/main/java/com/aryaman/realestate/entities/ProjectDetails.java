package com.aryaman.realestate.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class ProjectDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String projectName;
	private String price;
	private String location;
	private String photo;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "builder_id")
	private Builder builder;
	private String targetCompletion;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Builder getBuilder() {
		return builder;
	}
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	public String getTargetCompletion() {
		return targetCompletion;
	}
	public void setTargetCompletion(String targetCompletion) {
		this.targetCompletion = targetCompletion;
	}
	@Override
	public String toString() {
		return "ProjectDetails [id=" + id + ", projectName=" + projectName + ", price=" + price + ", location="
				+ location + ", photo=" + photo + ", builder=" + builder + ", targetCompletion=" + targetCompletion
				+ "]";
	}
	
	

}
