package com.prutha.university.studentportal.services;

import java.util.ArrayList;
import java.util.List;

import com.prutha.university.studentportal.database.Database;
import com.prutha.university.studentportal.model.Message;

public class MessageService {

	private Database db = new Database();
	
	public List<Message> listAllMessages() {
		return new ArrayList<Message>(db.messages.values());
	}

	public Message getMessage(int id) {
		return db.messages.get(id);
	}

	public Message addMessage(Message message) {
		int id = (1 + db.messages.size());
		message.setId(id);
		db.messages.put(id, message);
		return message;
	}

	public Message updateMessage(int id, Message m) {
		
		// Check if the id of teh updated message is greater than the size of teh list
		if( m.getId() > db.messages.size()){
			return null;
		}
		else{
			db.messages.put(m.getId(), m);
		}
		
		return m;
	}

	public Message removeMessage(int id) throws Exception {
		Message m = null ;
		
		if( id > db.messages.size() ){
			throw new Exception("Invalid Message Id.");
		}else{
			m = db.messages.get(id);
		}
		return m;
	}

	
}
