package com.aryaman.realestate.model;

public class LoginDTO {
	private String userName;
	private String pwd;
	private String role;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userId) {
		this.userName = userId;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "LoginDTO [userName=" + userName + ", pwd=" + pwd + ", role=" + role + "]";
	}
	
	

}
