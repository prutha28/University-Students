package com.prutha.university.studentportal.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// NOTE: The @Path annotation is optional in case of subresources.

//@Path("/")
public class CommentResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String test(){
		return "Hello World";
	}
}
