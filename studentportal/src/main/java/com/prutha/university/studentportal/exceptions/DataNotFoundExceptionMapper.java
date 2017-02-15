package com.prutha.university.studentportal.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<MyDataNotFoundException>{

	@Override
	public Response toResponse(MyDataNotFoundException e) {
		return Response
				.status(Status.NOT_FOUND)
				.build();
	}

}
