package com.aryaman.realestate.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDate pmtDate;
	private String cardno;
	private String remarks;
	private String nameOnCard;
	private int amount;
	private boolean isCompleted;
	@ManyToOne
	@JoinColumn(name="appointment_id")
	private Appointment appointment;
	
	public Payment() {
		this.pmtDate=LocalDate.now();
		this.isCompleted=false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getPmtDate() {
		return pmtDate;
	}

	public void setPmtDate(LocalDate pmtDate) {
		this.pmtDate = pmtDate;
	}

	public String getCardno() {
		return cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", pmtDate=" + pmtDate + ", cardno=" + cardno + ", remarks=" + remarks
				+ ", nameOnCard=" + nameOnCard + ", amount=" + amount + ", isCompleted=" + isCompleted
				+ ", appointment=" + appointment + "]";
	}
	
	

}
