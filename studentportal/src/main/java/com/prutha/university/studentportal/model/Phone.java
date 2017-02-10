package com.prutha.university.studentportal.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Phone {

	private String unityId;
	private String type;
	private String phoneNumber;
	
	public Phone(){
		
	}
	
	public Phone(String unityId, String type, String phoneNumber) {
		super();
		this.unityId = unityId;
		this.type = type;
		this.phoneNumber = phoneNumber;
	}
	public String getUnityId() {
		return unityId;
	}
	public void setUnityId(String unityId) {
		this.unityId = unityId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
