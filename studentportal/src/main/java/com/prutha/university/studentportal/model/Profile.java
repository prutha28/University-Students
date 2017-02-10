package com.prutha.university.studentportal.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {

	private int id;
	private String name;
	
	public Profile(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Profile(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
