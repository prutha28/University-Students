package com.prutha.university.studentportal.domain.objects;

public class HasCurrentTermDO {

	private String studentId;
	private String termId;
	private float gpa;
	
	public String getStudentId() {
		return studentId;
	}
	
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public String getTermId() {
		return termId;
	}
	
	public void setTermId(String termId) {
		this.termId = termId;
	}
	
	public float getGpa() {
		return gpa;
	}
	
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	
}
