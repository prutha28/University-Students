package com.prutha.university.studentportal.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BelongsTo {

	private String courseId;
	private String deptId;
	
	public BelongsTo(){
		
	}
	
	public String getCourseId() {
		return courseId;
	}
	
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	
	public String getDeptId() {
		return deptId;
	}
	
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	
	
}
