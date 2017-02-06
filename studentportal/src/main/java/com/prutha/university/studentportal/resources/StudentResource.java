package com.prutha.university.studentportal.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.prutha.university.studentportal.entities.Address;
import com.prutha.university.studentportal.entities.Student;

@Path("/students")
public class StudentResource {
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getAllStudents(
			@PathParam("studentId") String studentid){
		return "<html><body><h1>Hi Students!</h1><p>" + studentid +  "</p></body></html>";
	}
	
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/{studentId}")
	public String getStudent(
			@PathParam("studentId") String studentid){
		return "<html><body><h1>Hi student!</h1><p>" + studentid +  "</p></body></html>";
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_HTML)
	public String addStudent(){
		return "<html><body><h1>Hi Prutha!</h1><p>";
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_HTML)
	@Path("/{studentId}")
	public String updateStudent(
			@PathParam("studentId") String studentid){
		return "StudentDO details updated successfully.";
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_HTML)
	@Path("/{studentId}")
	public String deleteStudent(
			@PathParam("studentId") String studentid){
		return "StudentDO deleted successfully.";
	}
}
