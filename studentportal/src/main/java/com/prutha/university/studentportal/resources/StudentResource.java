package com.prutha.university.studentportal.resources;

import java.sql.SQLException;
import java.util.ArrayList;
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

import com.prutha.university.studentportal.model.Student;
import com.prutha.university.studentportal.services.StudentService;

@Path("/students")
public class StudentResource {

	StudentService service = new StudentService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Student> getAllStudents(){
//		return "<html><body><h1>Hi Students!</h1><p></p></body></html>";
//		return service.getAllStudents();
		List<Student> students = new ArrayList<Student>();
		Student s1 = new Student("1", "Alex");
		Student s2 = new Student("1", "Mer");
		students.add(s1);
		students.add(s2);
		return students;
	}
	
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/{studentId}")
	public String getStudent(
			@PathParam("studentId") String studentid) throws SQLException{
		Student s = StudentService.getStudent(studentid);
		return "<html><body><h1>Hi student!</h1><p>" + s +  "</p></body></html>";
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_HTML)
	public String addStudent(){
		return "<html><body><h1>Hi Prutha!</h1><p>";
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_HTML)
	@Path("/{studentId}")
	public String updateStudent(
			@PathParam("studentId") String studentid){
		return "StudentDO details updated successfully.";
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_HTML)
	@Path("/{studentId}")
	public String deleteStudent(
			@PathParam("studentId") String studentid){
		return "StudentDO deleted successfully.";
	}
}
