package com.aryaman.realestate.model;

public class PropertyDTO {
	
	private String id;
	private String noOfRooms;
	private String city;
	private String area;
	private int projid;
		
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getprojid() {
		return projid;
	}
	public void setBldid(int projid) {
		this.projid = projid;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "PropertyDTO [id=" + id + ", noOfRooms=" + noOfRooms + ", city=" + city + ", area=" + area + ", projid="
				+ projid + "]";
	}
		
	

}
