package com.aryaman.realestate.model;

public class AppointmentStatusDTO {
	
	private int apid;
	private String status;
	private String apno;
	public int getApid() {
		return apid;
	}
	public void setApid(int apid) {
		this.apid = apid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getApno() {
		return apno;
	}
	public void setApno(String apno) {
		this.apno = apno;
	}
	@Override
	public String toString() {
		return "AppointmentStatusDTO [apid=" + apid + ", status=" + status + ", apno=" + apno + "]";
	}
	
	

}
