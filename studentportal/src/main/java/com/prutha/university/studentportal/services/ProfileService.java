package com.prutha.university.studentportal.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.prutha.university.studentportal.database.Database;
import com.prutha.university.studentportal.model.Profile;

public class ProfileService {

	Map<Integer, Profile> profiles = Database.getProfiles();
	
	public ProfileService(){
		profiles.put(1, new Profile(1, "prutha"));
		profiles.put(2, new Profile(2, "priysha"));
		profiles.put(3, new Profile(3, "nisha"));
	}
	
	public Profile getProfile(int id) {
		return profiles.get(id);
	}

	public List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profiles.values());
	}

	public Profile addProfile(Profile profile) {
		int id = profiles.size() + 1 ;
		profile.setId(id);
		return profiles.put(id, profile);
	}

	public Profile updateProfile(Profile profile) {
		profiles.put(profile.getId(), profile);
		return profiles.get(profile.getId());
	}

	public Profile deleteProfile(int profileId) {
		return profiles.remove(profileId);
	}

}
