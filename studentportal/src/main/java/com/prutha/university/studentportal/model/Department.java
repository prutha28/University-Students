package com.prutha.university.studentportal.model;

public class Department {

	private String deptId;
	private String deptName;
	private String hodName;
	private int facultyCount;

	public String getDeptId() {
		return deptId;
	}
	
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	
	public String getDeptName() {
		return deptName;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public String getHodName() {
		return hodName;
	}
	
	public void setHodName(String hodName) {
		this.hodName = hodName;
	}
	
	public int getFacultyCount() {
		return facultyCount;
	}
	
	public void setFacultyCount(int facultyCount) {
		this.facultyCount = facultyCount;
	}
}
