package com.moveon.rental.model;

public class Address {
	
	private String addressLine1;
	
	private String addressLine2;
	
	private CITY city;
	
	private STATE state;
	
	private COUNTRY country;
	
	private String zipCode;
	
	private double[] longLat ;
	
	
	public double[] getLongLat() {
		return longLat;
	}

	public void setLongLat(double[] longLat) {
		this.longLat = longLat;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public CITY getCity() {
		return city;
	}

	public void setCity(CITY city) {
		this.city = city;
	}

	public STATE getState() {
		return state;
	}

	public void setState(STATE state) {
		this.state = state;
	}

	public COUNTRY getCountry() {
		return country;
	}

	public void setCountry(COUNTRY country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	

}
