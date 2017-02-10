package com.prutha.university.studentportal.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Faculty {

	private String professorId;
	private String designation;
	private String officeAddress;
	private String officeHours;
	
	public Faculty(){
		
	}
	
	public Faculty(String professorId, String designation, String officeAddress, String officeHours) {
		super();
		this.professorId = professorId;
		this.designation = designation;
		this.officeAddress = officeAddress;
		this.officeHours = officeHours;
	}
	
	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getProfessorId() {
		return professorId;
	}
	public void setProfessorId(String professorId) {
		this.professorId = professorId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}
