package com.prutha.university.studentportal.resources;

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

import com.prutha.university.studentportal.model.Faculty;

@Path("/faculties")
public class FacultyResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Faculty> getAllFaculties(){
		return null ;
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Faculty addFaculty( Faculty faculty){
		return null;
	}
	
	@GET
	@Path("/{facultyId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Faculty getFaculty( @PathParam("facultyId") String facultyId){
		return null;
	}
	
	@PUT
	@Path("/{facultyId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Faculty updateFaculty( @PathParam("facultyId") String facultyId, Faculty faculty){
		return null;
	}
	
	@DELETE
	@Path("/{facultyId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Faculty deleteFaculty( @PathParam("facultyId") String facultyId){
		return null;
	}
	
}
