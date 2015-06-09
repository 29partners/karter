package com.moveon.rental.model;

import java.util.Date;

public class Order extends BaseModel {
	
	
	private String name ;
	
	private long phoneNumber;
	
	private Address pickupLocation ;
	
	private Address dropLocation ;
	
	private Date requestedDate ;
	
	private Date orderedDate;
	
	private String emailId;
	
	private String OTP;
	
	private ORDERSTATUS status;
	
	
	public String getOTP() {
		return OTP;
	}

	public void setOTP(String oTP) {
		OTP = oTP;
	}

	public ORDERSTATUS getStatus() {
		return status;
	}

	public void setStatus(ORDERSTATUS status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getPickupLocation() {
		return pickupLocation;
	}

	public void setPickupLocation(Address pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public Address getDropLocation() {
		return dropLocation;
	}

	public void setDropLocation(Address dropLocation) {
		this.dropLocation = dropLocation;
	}

	public Date getRequestedDate() {
		return requestedDate;
	}

	public void setRequestedDate(Date requestedDate) {
		this.requestedDate = requestedDate;
	}

	public Date getOrderedDate() {
		return orderedDate;
	}

	public void setOrderedDate(Date orderedDate) {
		this.orderedDate = orderedDate;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	
	@Override
	public String toString() {
	
		return "[name -> "+getName()+";_id->"+getId()+"]";
	}
}
