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

import com.prutha.university.studentportal.model.Department;

@Path("/departments")
public class DepartmentResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Department> getAlldepartments(){
		return null;
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Department adddepartment( Department department){
		return null;
	}
	
	@GET
	@Path("/{deptId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Department getdepartment( @PathParam("deptId") String deptId){
		return null;
	}
	
	@PUT
	@Path("/{deptId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Department updatedepartment( @PathParam("deptId") String deptId, Department department){
		return null;
	}
	
	@DELETE
	@Path("/{deptId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Department deletedepartment( @PathParam("deptId") String deptId, Department department){
		return null;
	}
}
