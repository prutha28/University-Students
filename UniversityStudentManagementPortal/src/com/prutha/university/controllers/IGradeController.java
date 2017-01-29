package com.prutha.university.controllers;

import java.util.List;

import com.prutha.university.resources.GradeResource;

public interface IGradeController {

	public GradeResource getGrade( String studentId);
	
	public List<GradeResource> listGrades();
		
	public GradeResource updateGrade();
		
	public GradeResource removeGrade();
	
	public String addGrade(GradeResource grade);
}
