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

import com.prutha.university.studentportal.model.Address;

@Path("/addresses")
public class AddressResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Address> getAllAddresses(){
		return null;
	}
	
	@GET
	@Path("/{addressId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Address getAddress( @PathParam("addressId") String addressId){
		return null;
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Address addAddress(Address address){
		return null;
	}
	
	@PUT
	@Path("/{addressId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Address updateAddress( @PathParam("addressId") String addressId, Address address){
		return null;
	}
	
	@DELETE
	@Path("/{addressId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Address deleteAddress( @PathParam("addressId") String addressId, Address address){
		return null;
	}
}
