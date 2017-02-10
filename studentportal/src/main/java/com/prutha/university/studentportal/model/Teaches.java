package com.prutha.university.studentportal.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Teaches {

	private String professorId;
	private String courseid;
	private String termId;
	
	public Teaches(){
		
	}
	
	public Teaches(String professorId, String courseid, String termId) {
		super();
		this.professorId = professorId;
		this.courseid = courseid;
		this.termId = termId;
	}

	public String getProfessorId() {
		return professorId;
	}
	
	public void setProfessorId(String professorId) {
		this.professorId = professorId;
	}
	
	public String getCourseid() {
		return courseid;
	}
	
	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	
	public String getTermId() {
		return termId;
	}
	
	public void setTermId(String termId) {
		this.termId = termId;
	}
	
}
