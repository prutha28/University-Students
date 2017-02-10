package com.prutha.university.studentportal.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import com.prutha.university.studentportal.database.Database;
import com.prutha.university.studentportal.model.Message;

public class MessageService {

	private Map<Integer, Message> messages = Database.getMessages();
	
	public MessageService(){
		messages.put(1, new Message(1, "Hello World!", "prutha"));
		messages.put(2, new Message(2, "Hello everyone!", "prisha"));
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
	
	
	public Message getMessage(int id) {
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
		
		// Check if the id of teh updated message is greater than the size of teh list
		if( m.getId() > messages.size()){
			return null;
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
