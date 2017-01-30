package com.prutha.university.studentportal.controllers;

import java.util.List;

import com.prutha.university.studentportal.resources.EmailResource;

public interface IEmailController {

	public EmailResource getEmail( String emailId);
	
	public List<EmailResource> listEmails();
		
	public EmailResource updateEmail( String emailId);
		
	public EmailResource removeEmail( String emailId);
	
	public String addEmail(EmailResource email);
}
