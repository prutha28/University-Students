package com.prutha.university.studentportal.resources;

import java.net.URI;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import com.prutha.university.studentportal.exceptions.MyDataNotFoundException;
import com.prutha.university.studentportal.model.Message;
import com.prutha.university.studentportal.services.MessageService;

@Path("/messages")
public class MessageResource {

	private MessageService service = new MessageService();

	// We can only have exactly one GET method, irrespective of how many queryparams we pass.
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages(
			@QueryParam("year") int year,
			@QueryParam("start") int start,
			@QueryParam("size") int size){
		
		if( year > 0 ){
			service.listAllMessagesByYear(year);
		}
		
		if( start >= 0  && size > 0){
			service.listAllMessagesPaginated(start, size);
		}
		
		return service.listAllMessages();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{messageId}")
	public Response getMessage( @PathParam("messageId") int id,
								@Context UriInfo uriInfo) {
		
		Message m = service.getMessage(id);
		if( m == null )
			throw new MyDataNotFoundException();

		else{
			String uri = getURLForSelf(id, uriInfo);
			m.addLinkToList(uri, "self");
			
		}
	
		return Response.status(Status.OK)
					   .entity(m)
					   .build();
		
	}

	private String getURLForSelf(int id, UriInfo uriInfo) {
		String uri = uriInfo.getBaseUriBuilder() // http://localhost:8080/webapi/
				.path(MessageResource.class)	// finds the class level annotation  e.g. /messages
				.path(Integer.toString(id))
				.build()
				.toString();
		return uri;
	}
	
	// Step1: Return a Response object in place of the actual Message Entity
	// Step2: Use the @Context Annotation to get the URI for the Message Resource
	// Step3: Use the getAbsolutePathBuilder to form the resource URI
	// Step4: Pass the location in Step3 to Response.created method.
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addMessage(@Context UriInfo uriInfo,  Message message){
		Message newMessage =  service.addMessage(message);
		String newMessageId = String.valueOf(newMessage.getId());
		URI location = uriInfo.getAbsolutePathBuilder().path(newMessageId).build();
		return Response.created(location)
				.entity(newMessage)
				.build();
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{messageId}")
	public Message updateMessage(@PathParam("messageId")int id, Message m){
		// Important : This makes sure that the id in the pathparam overrides the id 
		// passed by the client in request body ( If At all). 
		m.setId(id);
		return service.updateMessage(m);
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{messageId}")
	public Message deleteMessage( @PathParam("messageId")int id) throws Exception{
		return service.removeMessage(id);
	}
	
	@Path("/{messageId}/comments")
	public CommentResource getCommentResource(){
		return new CommentResource();
	}
	
}
