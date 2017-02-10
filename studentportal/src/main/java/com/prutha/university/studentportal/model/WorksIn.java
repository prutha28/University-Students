package com.prutha.university.studentportal.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class WorksIn {

	private String professorId;
	private String deptId;
	private Date since;
	
	public WorksIn(){
	}
	
	public WorksIn(String professorId, String deptId, Date since) {
		this.professorId = professorId;
		this.deptId = deptId;
		this.since = since;
	}

	public String getProfessorId() {
		return professorId;
	}
	
	public void setProfessorId(String professorId) {
		this.professorId = professorId;
	}
	
	public String getDeptId() {
		return deptId;
	}
	
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	
	public Date getSince() {
		return since;
	}
	
	public void setSince(Date since) {
		this.since = since;
	}
	
}
