package com.prutha.university.studentportal.controllers;

import java.util.List;

import com.prutha.university.studentportal.resources.PhoneResource;

public interface IPhoneController {

	public PhoneResource getPhone( String phoneId);
	
	public List<PhoneResource> listPhones();
		
	public PhoneResource updatePhone( String phoneId);
		
	public PhoneResource removePhone( String phoneId);
	
	public String addPhone(PhoneResource phone);
}
