package com.prutha.university.studentportal.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EmergencyContact extends Phone{

	private String fullName;
	private String relationShip;
	private String countryCode;
	
	public EmergencyContact(){
		
	}
	
	public EmergencyContact(String fullName, String relationShip, String countryCode) {
		super();
		this.fullName = fullName;
		this.relationShip = relationShip;
		this.countryCode = countryCode;
	}

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
