package com.prutha.university.studentportal.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.prutha.university.studentportal.model.ErrorMessage;

@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<MyDataNotFoundException>{

	@Override
	public Response toResponse(MyDataNotFoundException e) {
		// Build the object that gets showed in the browser
		ErrorMessage error = new ErrorMessage("The requested Data is currently not found.", 
												404, // This could be any custom error code 
												"Some link to the online documentation");
		
		return Response
				.status(Status.NOT_FOUND)
				.entity(error)
				.build();
	}

}
