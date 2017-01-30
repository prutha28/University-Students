package com.prutha.university.studentportal.controllers;

import java.util.List;

import com.prutha.university.studentportal.resources.GradeResource;

public interface IGradeController {

	public GradeResource getGrade( String studentId);
	
	public List<GradeResource> listGrades();
		
	public GradeResource updateGrade();
		
	public GradeResource removeGrade();
	
	public String addGrade(GradeResource grade);
}
