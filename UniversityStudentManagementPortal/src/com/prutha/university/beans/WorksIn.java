package com.prutha.university.beans;

import java.util.Date;

public class WorksIn {

	private String professorId;
	private String deptId;
	private Date since;
	
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
