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

	private static Map<Integer, Message> messages = new HashMap<Integer, Message>();

	public static Map<Integer, Message> getMessages() {
		return messages;
	}

	public static void setMessages(Map<Integer, Message> messages) {
		messages = messages;
	}
	
}
