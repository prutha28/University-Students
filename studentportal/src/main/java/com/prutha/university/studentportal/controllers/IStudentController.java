package com.prutha.university.studentportal.controllers;

import java.util.List;

import com.prutha.university.studentportal.resources.StudentResource;

public interface IStudentController {

	public StudentResource getStudent( String studentId);
		
	public List<StudentResource> listStudents();
		
	public StudentResource updateStudent(String student);
		
	public StudentResource removeStudent(String student);
	
	public String addStudent(StudentResource studentId);

}
