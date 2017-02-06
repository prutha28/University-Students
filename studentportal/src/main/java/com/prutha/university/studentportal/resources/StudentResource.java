package com.prutha.university.studentportal.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/students")
public class StudentResource {
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getStudent(){
//		ResponseBuilder rb = Response.accepted();
//		return rb.build();
		return "<html><body><h1>Hi Prutha!</h1></body></html>";
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_HTML)
	public String addStudent(){
		return "A new Student added successfully.";
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_HTML)
	public String updateStudent(){
		return "Student details updated successfully.";
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_HTML)
	public String deleteStudent(){
		return "Student deleted successfully.";
	}
}
