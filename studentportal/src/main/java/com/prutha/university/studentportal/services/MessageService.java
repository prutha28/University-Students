package com.prutha.university.studentportal.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.prutha.university.studentportal.database.Database;
import com.prutha.university.studentportal.model.Comment;
import com.prutha.university.studentportal.model.ErrorMessage;
import com.prutha.university.studentportal.model.Message;

public class MessageService {

	private Map<Integer, Message> messages = Database.getMessages();
	private Map<Integer, Comment> comments = Database.getCommnets();
	
	public Map<Integer, Message> getMessages() {
		return messages;
	}

	public Map<Integer, Comment> getComments() {
		return comments;
	}

	public MessageService(){
		messages.put(1, new Message(1, "Hello World!", "prutha"));
		messages.put(2, new Message(2, "Hello everyone!", "prisha"));
		
		Message message1 = messages.get(1);
		Map<Integer, Comment> comments = new HashMap<Integer, Comment>();
		comments.put(1, new Comment(1, "Hello World! comment", "nishak"));
		comments.put(2, new Comment(2, "Hello everyone! comment", "nishak"));
		message1.setComments(comments);
		
		Database.setMessages(messages);
		Database.setCommnets(comments);
	}
	
	public List<Message> listAllMessages() {
		return new ArrayList<Message>(messages.values());
	}

	public List<Message> listAllMessagesByYear(int year) {
		
		List<Message> messagesForYear = new ArrayList<Message>();
		Calendar cal = Calendar.getInstance();
		
		for( Message message : messages.values()){
			cal.setTime(message.getCreatedAt());
			
			if( cal.get(Calendar.YEAR) == year){
				messagesForYear.add(message);
			}
		}
		return messagesForYear;
	}
	
	public List<Message> listAllMessagesPaginated( int start, int size) {
		ArrayList<Message> listOfMessages = new ArrayList<Message>(messages.values());
		if( start + size > messages.size())
			return null;
		else
			return listOfMessages.subList(start, start + size);
	}
	
	public Message getMessage(int id){
		return messages.get(id);
	}

	public Message addMessage(Message message) {
		int id = (1 + messages.size());
		message.setId(id);
		messages.put(id, message);
		System.out.println(messages);
		return message;
	}

	public Message updateMessage(Message m) {
		
		// Check if the id of the updated message is greater than the size of teh list
		if( m.getId() > messages.size()){

			ErrorMessage genericMessage = new ErrorMessage("The requested message id is not valid.", 
					404, "documentation");
		
			Response errorResponse = Response.status(Status.NOT_FOUND)
						   					  .entity(genericMessage).build();
			throw new WebApplicationException(errorResponse);
		}
		else{
			messages.put(m.getId(), m);
		}
		
		return m;
	}

	public Message removeMessage(int id) throws Exception {
		Message m = null ;
		
		if( id > messages.size() ){
			throw new Exception("Invalid Message Id.");
		}else{
			m = messages.get(id);
		}
		return m;
	}

	
}
