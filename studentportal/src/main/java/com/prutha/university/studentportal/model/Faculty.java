package com.prutha.university.studentportal.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Professor extends Person{
	
	private String professorId;
	private String designation;
	
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
