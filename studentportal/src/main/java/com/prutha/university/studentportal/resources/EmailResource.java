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

import com.prutha.university.studentportal.model.Email;


@Path("/emails")
public class EmailResource {
		
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Email> getAllEmails(){
		return null;
	}
		
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Email addEmail( Email email){
		return null;
	}
		
	@GET
	@Path("/{emailId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Email getEmail( @PathParam("emailId") String emailId){
		return null;
	}
		
	@PUT
	@Path("/{emailId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Email updateEmail( @PathParam("emailId") String emailId, Email email){
		return null;
	}
	
	@DELETE
	@Path("/{emailId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Email deleteEmail( @PathParam("emailId") String emailI){
		return null;
	}
}
