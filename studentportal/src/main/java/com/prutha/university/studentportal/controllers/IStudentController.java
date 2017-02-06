package com.prutha.university.studentportal.controllers;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.prutha.university.studentportal.resources.StudentResource;

@Path("students")
public interface IStudentController {

//	@GET
//	@Path("/{studentId}")
//	@Produces(MediaType.TEXT_PLAIN)
//	public StudentResource getStudent(String studentId);
		
//	@GET
//	public List<StudentResource> listStudents();
		
	@PUT
	@Path("/{studentId}")
	@Consumes("application/json")
	@Produces(MediaType.TEXT_PLAIN)
	public StudentResource updateStudent(@PathParam("studentId")  String studentId);
	
	@DELETE
	@Path("/{studentId}")
	@Consumes("application/json")
	@Produces(MediaType.TEXT_PLAIN)
	public StudentResource removeStudent(@PathParam("studentId") String studentId);
	
	@POST
	@Consumes("application/json")
	@Produces(MediaType.TEXT_PLAIN)
	public String addStudent(StudentResource student);

}
