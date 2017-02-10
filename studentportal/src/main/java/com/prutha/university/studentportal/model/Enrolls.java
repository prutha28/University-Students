package com.prutha.university.studentportal.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Enrolls {

	private String studentId;
	private String courseId;
	private String termId;
	private char gradeScored;
	
	public String getStudentId() {
		return studentId;
	}
	
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public String getCourseId() {
		return courseId;
	}
	
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	
	public String getTermId() {
		return termId;
	}
	
	public void setTermId(String termId) {
		this.termId = termId;
	}
	
	public char getGradeScored() {
		return gradeScored;
	}
	
	public void setGradeScored(char gradeScored) {
		this.gradeScored = gradeScored;
	}

}
