package com.prutha.university.studentportal.domain.objects;

public class ProfessorDO extends PersonDO{
	
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
