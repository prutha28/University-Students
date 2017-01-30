package com.prutha.university.studentportal.controllers;

import java.util.List;

import com.prutha.university.studentportal.resources.CourseResource;

public interface ICourseController {

	public CourseResource getCourse( String courseId);
	
	public List<CourseResource> listCourses();
		
	public CourseResource updateCourse( String courseId);
		
	public CourseResource removeCourse( String courseId);
	
	public String addCourse(CourseResource course);

}
