package com.prutha.university.studentportal.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.prutha.university.studentportal.model.ErrorMessage;

/**
 * This class is created as a generic template to be shown whenever 
 * any exception is thrown and not handled. This avoids the default
 * tomcat page from being shown.
 * @author prutha
 *
 */

@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

	@Override
	public Response toResponse(Throwable exception) {
		ErrorMessage genericMessage = new ErrorMessage("A generic Error Message.", 
				501, "documentation");
		return Response.status(Status.NOT_IMPLEMENTED)
					   .entity(genericMessage)
				       .build();
	}

	
	
}
