package com.prutha.university.studentportal.resources;

import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.prutha.university.studentportal.beans.MessageBeanFilter;
import com.prutha.university.studentportal.model.Message;
import com.prutha.university.studentportal.services.MessageService;

@Path("/exploringAnnotations")
public class ExploringAnnotations {

	/**
	 * Matrix parameters are just like query parameters, except that they are denoted by ;
	 * in the URL instead of the ? in case of the queryParams
	 * @param headerValue
	 * @param matrixParam
	 * @param cookieName
	 * @return
	 */
	@GET
	@Path("/exploringAnnotations")
	public String showMoreAnnotations(
			@HeaderParam("headerName") String headerValue,
			@MatrixParam("matrixParam") String matrixParam,
			@CookieParam("cookieName") String cookieName){
		return "Header Value : " + headerValue + "\n" 
			+ "Matrix Param : " + matrixParam +  "\n"
			+ "Cookie : " + cookieName;
	}
	
}
