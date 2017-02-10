package com.prutha.university.studentportal.database;

import java.util.HashMap;
import java.util.Map;

import com.prutha.university.studentportal.model.Message;
import com.prutha.university.studentportal.model.Profile;

/**
 * A Dummy database class that holds some dummy data
 * @author prutha
 *
 */
public class Database {

	private static Map<Integer, Message> messages = new HashMap<Integer, Message>();
	private static Map<Integer, Profile> profiles = new HashMap<Integer, Profile>();

	public static Map<Integer, Message> getMessages() {
		return messages;
	}
	
	public static Map<Integer, Profile> getProfiles() {
		return profiles;
	}

	
}
