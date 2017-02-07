package com.prutha.university.studentportal.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/addresses")
public class AddressResource {
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getAllAddresses(){
		return "All Addresses";
	}
	
	@POST
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.TEXT_HTML)
	public String addAddress(){
		return "Address Added";
	}
	
	@GET
	@Path("/{addressId}")
	@Produces(MediaType.TEXT_HTML)
	public String getAddress( String addressId){
		return "Getting Address & its details";
	}
	
	@PUT
	@Path("/{addressId}")
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.TEXT_HTML)
	public String updateAddress( String addressId){
		return "Updating Address details";
	}
	
	@DELETE
	@Path("/{addressId}")
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.TEXT_HTML)
	public String deleteAddress( String addressId){
		return "Deleting an Address";
	}
}
