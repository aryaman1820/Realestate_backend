package com.aryaman.realestate.model;

public class AppointmentCompleteDTO {
	
	private int apid;
	private int amount;
	private int rating;
	private String cardno;
	private String nameOnCard;
	private String feedback;
	public int getApid() {
		return apid;
	}
	public void setApid(int apid) {
		this.apid = apid;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
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
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	@Override
	public String toString() {
		return "AppointmentCompleteDTO [apid=" + apid + ", amount=" + amount + ", rating=" + rating + ", cardno="
				+ cardno + ", nameOnCard=" + nameOnCard + ", feedback=" + feedback + "]";
	}
	
	

}
