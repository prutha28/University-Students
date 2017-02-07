package com.prutha.university.studentportal.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/emails")
public class EmailResource {
		
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getAllEmails(){
		return "All Emails";
	}
		
	@POST
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.TEXT_HTML)
	public String addEmail(){
		return "Email Added";
	}
		
	@GET
	@Path("/{emailId}")
	@Produces(MediaType.TEXT_HTML)
	public String getEmail( String emailId){
		return "Getting Email & its details";
	}
		
	@PUT
	@Path("/{emailId}")
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.TEXT_HTML)
	public String updateEmail( String emailId){
		return "Updating Email details";
	}
	
	@DELETE
	@Path("/{emailId}")
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.TEXT_HTML)
	public String deleteEmail( String emailId){
		return "Deleting an Email";
	}
}
