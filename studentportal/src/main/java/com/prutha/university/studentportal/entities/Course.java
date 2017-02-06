package com.prutha.university.studentportal.entities;

public class Course {

	private String courseNo;
	private String courseName;
	private String sectionNumber;
	private int creditPoints;
	
	public String getCourseNo() {
		return courseNo;
	}
	
	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getSectionNumber() {
		return sectionNumber;
	}
	
	public void setSectionNumber(String sectionNumber) {
		this.sectionNumber = sectionNumber;
	}
	
	public int getCreditPoints() {
		return creditPoints;
	}
	
	public void setCreditPoints(int creditPoints) {
		this.creditPoints = creditPoints;
	}
}
