package com.prutha.university.studentportal.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/faculties")
public class FacultyResource {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getAllFaculties(){
		return "All Faculties";
	}
	
	@POST
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.TEXT_HTML)
	public String addFaculty(){
		return "A new Faculty Added";
	}
	
	@GET
	@Path("/{facultyId}")
	@Produces(MediaType.TEXT_HTML)
	public String getFaculty( String facultyId){
		return "Getting Faculty & its details";
	}
	
	@PUT
	@Path("/{facultyId}")
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.TEXT_HTML)
	public String updateFaculty( String facultyId){
		return "Updating Faculty details";
	}
	
	@DELETE
	@Path("/{facultyId}")
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.TEXT_HTML)
	public String deleteFaculty( String facultyId){
		return "Deleting a Faculty from the system";
	}
	
}
