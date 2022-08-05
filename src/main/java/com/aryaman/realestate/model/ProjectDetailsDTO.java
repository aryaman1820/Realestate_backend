package com.aryaman.realestate.model;

import org.springframework.web.multipart.MultipartFile;

import com.aryaman.realestate.entities.Builder;

public class ProjectDetailsDTO {
	private int projid;
	private String projectName;
	private String price;
	private String location;
	private MultipartFile photo;
	private Builder builder;
	private String targetCompletion;
	
	
	public int getProjid() {
		return projid;
	}
	public void setProjid(int projid) {
		this.projid = projid;
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
	public MultipartFile getPhoto() {
		return photo;
	}
	public void setPhoto(MultipartFile photo) {
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
		return "ProjectDetailsDTO [projid=" + projid + ", projectName=" + projectName + ", price=" + price
				+ ", location=" + location + ", photo=" + photo + ", builder=" + builder + ", targetCompletion="
				+ targetCompletion + "]";
	}
	
	

}
