package com.aryaman.realestate.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDate fromdate;
	private LocalDate todate;
	private String message;
	private LocalDateTime bookingdate;
	private String status;
	private int bookingAmount;
	private int amountPaid;
	@ManyToOne
	@JoinColumn(name="projectdetails_id")	
	private ProjectDetails projectdetails;
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;
	@ManyToOne
	@JoinColumn(name="property_id")
	private Property property;
	
	
	
	public Appointment() {
		this.status="Pending";
		this.bookingdate=LocalDateTime.now();
	}
	
	
	
	
	
	public int getAmountPaid() {
		return amountPaid;
	}





	public void setAmountPaid(int amountPaid) {
		this.amountPaid = amountPaid;
	}





	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public LocalDateTime getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(LocalDateTime bookingdate) {
		this.bookingdate = bookingdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getBookingAmount() {
		return bookingAmount;
	}
	public void setBookingAmount(int bookingAmount) {
		this.bookingAmount = bookingAmount;
	}
	public ProjectDetails getProjectdetails() {
		return projectdetails;
	}
	public void setProjectdetails(ProjectDetails projectdetails) {
		this.projectdetails = projectdetails;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Property getProperty() {
		return property;
	}
	public void setProperty(Property property) {
		this.property = property;
	}



	@Override
	public String toString() {
		return "Appointment [id=" + id + ", fromdate=" + fromdate + ", todate=" + todate + ", message=" + message
				+ ", bookingdate=" + bookingdate + ", status=" + status + ", bookingAmount=" + bookingAmount
				+ ", amountPaid=" + amountPaid + ", projectdetails=" + projectdetails + ", customer=" + customer
				+ ", property=" + property + "]";
	}
	
	
	
	
	

}
