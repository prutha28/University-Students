package com.prutha.university.studentportal.database;

import java.util.HashMap;
import java.util.Map;

import com.prutha.university.studentportal.model.Message;

/**
 * A Dummy database class that holds some dummy data
 * @author prutha
 *
 */
public class Database {

	public Map<Integer, Message> messages = new HashMap<Integer, Message>();
	
	public Database(){
		messages.put(1, new Message(1, "Hello World!", "prutha"));
		messages.put(2, new Message(2, "Hello everyone!", "prisha"));
	}

	
}
