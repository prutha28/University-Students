package com.prutha.university.beans;

import java.util.Date;

public class Person {

	private String unityId ;
	private String firstName ;
	private String lastName ;
	private String preferredName ;
	private String password ;
	private String gender;
	private Date dateOfBirth;
	
	public String getUnityId() {
		return unityId;
	}
	
	public void setUnityId(String unityId) {
		this.unityId = unityId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPreferredName() {
		return preferredName;
	}
	
	public void setPreferredName(String preferredName) {
		this.preferredName = preferredName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Person [unityId=" + unityId + ", firstName=" + firstName + ", lastName=" + lastName + ", preferredName="
				+ preferredName + ", password=" + password + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth
				+ "]";
	}
	
	
}
