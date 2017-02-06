package com.prutha.university.studentportal.domain.objects;

public class StudentDO extends PersonDO{

	private String studentId;
	private String degree;
	private float cgpa;
	private String advisorId;
	
	public String getStudentId() {
		return studentId;
	}
	
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public String getDegree() {
		return degree;
	}
	
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	public float getCgpa() {
		return cgpa;
	}
	
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	
	public String getAdvisorId() {
		return advisorId;
	}
	
	public void setAdvisorId(String advisorId) {
		this.advisorId = advisorId;
	}

	@Override
	public String toString() {
		return super.toString() +
				"StudentDO [studentId=" + studentId + ", degree=" + degree + ", cgpa=" + cgpa + ", advisorId=" + advisorId
				+ "]";
	}
	
	
}
