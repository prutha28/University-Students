package com.prutha.university.studentportal.controllers;

import java.util.List;

import com.prutha.university.studentportal.resources.FacultyResource;

public interface IFacultyController {

	public FacultyResource getFaculty( String facultyId);
	
	public List<FacultyResource> listFaculties();
		
	public FacultyResource updateFaculty( String facultyId);
		
	public FacultyResource removeFaculty( String facultyId);
	
	public String addFaculty(FacultyResource faculty);
}
