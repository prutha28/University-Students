package com.prutha.university.studentportal.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/courses")
public class CourseResource {

	@GET
	public String getAllCourses(){
		return "All courses";
	}
	
	@POST
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.TEXT_HTML)
	public String addCourse(){
		return "Course Added";
	}
	
	@GET
	@Path("/{courseId}")
	@Produces(MediaType.TEXT_HTML)
	public String getCourse( String courseId){
		return "Getting course & its details";
	}
	
	@PUT
	@Path("/{courseId}")
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.TEXT_HTML)
	public String updateCourse( String courseId){
		return "Updating course details";
	}
	
	@DELETE
	@Path("/{courseId}")
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.TEXT_HTML)
	public String deleteCourse( String courseId){
		return "Deleting a course";
	}
}
