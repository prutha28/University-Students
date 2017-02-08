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

import com.prutha.university.studentportal.model.Message;
import com.prutha.university.studentportal.services.MessageService;

@Path("/messages")
public class MessageResource {

	private MessageService service = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages(){
		return service.listAllMessages();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/{messageId}")
	public Message getMessage( @PathParam("messageId") int id){
		return service.getMessage(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_XML)
	public Message addMessage(Message message){
		return service.addMessage(message);
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_XML)
	@Path("/{messageId}")
	public Message updateMessage(@PathParam("messageId")int id, Message m){
		return service.updateMessage(id, m);
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_XML)
	@Path("/{messageId}")
	public Message deleteMessage( @PathParam("messageId")int id) throws Exception{
		return service.removeMessage(id);
	}
}
