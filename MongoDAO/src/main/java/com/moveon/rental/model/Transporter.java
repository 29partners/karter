package com.moveon.rental.model;

import java.util.Arrays;

public class Transporter extends BaseModel {
	
	
	private String transporterName ;
	
	private long[] phoneNumbers;
	
	private Address address ;
	
	private String emailId;

	public String getTransporterName() {
		return transporterName;
	}

	public void setTransporterName(String transporterName) {
		this.transporterName = transporterName;
	}

	public long[] getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(long[] phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	@Override
	public String toString() {
		return "[name -> "+getTransporterName()+";_id->"+getId()+";phone ->"+Arrays.toString(getPhoneNumbers())+"]";
	}
}
