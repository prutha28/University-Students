package com.prutha.university.studentportal.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Email {

	private String emailId;
	private String type;
	private String unityId;
	
	public String getEmailId() {
		return emailId;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getUnityId() {
		return unityId;
	}
	
	public void setUnityId(String unityId) {
		this.unityId = unityId;
	}
}
