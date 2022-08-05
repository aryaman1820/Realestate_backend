package com.aryaman.realestate.model;

import java.time.LocalDate;

public class AppointmentDTO {
	

	private LocalDate fromdate;
	private LocalDate todate;
	private String message;
	private int bookingAmount;
	private int amountPaid;
	private String cardno;
	private String nameOnCard;
	private String userid;
	private int projid;
	private String propid;
	
	
	
	
	public int getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(int amountPaid) {
		this.amountPaid = amountPaid;
	}
	public String getPropid() {
		return propid;
	}
	public void setPropid(String propid) {
		this.propid = propid;
	}
	public LocalDate getFromdate() {
		return fromdate;
	}
	public void setFromdate(LocalDate fromdate) {
		this.fromdate = fromdate;
	}
	public LocalDate getTodate() {
		return todate;
	}
	public void setTodate(LocalDate todate) {
		this.todate = todate;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getBookingAmount() {
		return bookingAmount;
	}
	public void setBookingAmount(int bookingAmount) {
		this.bookingAmount = bookingAmount;
	}
	public String getCardno() {
		return cardno;
	}
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public int getProjid() {
		return projid;
	}
	public void setProjid(int projid) {
		this.projid = projid;
	}
	@Override
	public String toString() {
		return "AppointmentDTO [fromdate=" + fromdate + ", todate=" + todate + ", message=" + message
				+ ", bookingAmount=" + bookingAmount + ", amountPaid=" + amountPaid + ", cardno=" + cardno
				+ ", nameOnCard=" + nameOnCard + ", userid=" + userid + ", projid=" + projid + ", propid=" + propid
				+ "]";
	}
	
	
	

}
