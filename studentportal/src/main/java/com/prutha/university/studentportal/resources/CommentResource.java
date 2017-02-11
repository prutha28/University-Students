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

import com.prutha.university.studentportal.model.Comment;
import com.prutha.university.studentportal.services.CommentService;
import com.prutha.university.studentportal.services.MessageService;

// NOTE: The @Path annotation is optional in case of subresources.

public class CommentResource {
	
	CommentService service = new CommentService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Comment> getComments(@PathParam("messageId") int messageId){
		return service.getAllComments(messageId) ;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{commentId}")
	public Comment getComment( 
			@PathParam("messageId") int messageId, 
			@PathParam("commentId") int commentId){
		return service.getComment(messageId, commentId) ;
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Comment createComment(@PathParam("messageId") int messageId, Comment comment){
		return service.addComment(messageId, comment);
	}
	
	@PUT
	@Path("/{commentId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Comment updateComment(
			@PathParam("messageId") int messageId, 
			@PathParam("commentId") int commentId, 
			Comment comment){
		comment.setId(commentId);
		return service.updateComment(messageId, comment);
	}
	
	@DELETE
	@Path("/{commentId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Comment deleteComment(
			@PathParam("messageId") int messageId,
			@PathParam("commentId") int commentId){
		return service.removeComment(messageId, commentId) ;
	}
	
}
