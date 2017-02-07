package com.prutha.university.studentportal.model;

public class EmergencyContact extends Contact{

	private String fullName;
	private String relationShip;
	private String countryCode;
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getRelationShip() {
		return relationShip;
	}
	
	public void setRelationShip(String relationShip) {
		this.relationShip = relationShip;
	}
	
	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
}
