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

import com.prutha.university.studentportal.model.Profile;
import com.prutha.university.studentportal.services.ProfileService;

@Path("/profiles")
public class ProfileResource {

	private ProfileService service = new ProfileService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Profile> getAllProfiles(){
		return service.getAllProfiles();
	}
	
	@GET
	@Path("/{profileId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Profile getProfile(@PathParam("profileId") int id){
		return service.getProfile(id);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Profile addProfile(Profile profile){
		return service.addProfile(profile);
	}
	
	@PUT
	@Path("/{profileId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Profile updateProfile(@PathParam("profileId") int id, Profile profile){
		profile.setId(id);
		return service.updateProfile(profile);
	}
	
	@DELETE
	@Path("/{profileId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Profile deleteProfile(@PathParam("profileId") int id, Profile profile){
		profile.setId(id);
		return service.deleteProfile( profile);
	}
}
