package com.prutha.university.studentportal.controllers;

import java.util.List;

import com.prutha.university.studentportal.resources.ContactResource;

public interface IContactResource{

	public ContactResource getContact( String contactId);
	
	public List<ContactResource> listContacts();
		
	public ContactResource updateContact( String contactId);
		
	public ContactResource removeContact( String contactId);
	
	public String addContact(ContactResource contact);
}
