package com.prutha.university.studentportal.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Message {

	private int id;
	private String message;
	private String author;
	private Date createdAt;
	private Map<Integer, Comment> comments = new HashMap<>();
	private List<Link> links = new ArrayList<Link>();
	
	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

	
	// The XmlTrasient annotation tells jersey not to include this field
	// when converting the java object to JSON/XML.
	@XmlTransient
	public Map<Integer, Comment> getComments() {
		return comments;
	}

	public void setComments(Map<Integer, Comment> comments) {
		this.comments = comments;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * No Args Constructor
	 */
	public Message(){
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Message(int id, String message, String author) {
		this.id = id;
		this.message = message;
		this.author = author;
		this.createdAt = new Date(); 
	}
	
	public void addLinkToList( String url, String rel){
		Link link = new Link(url, rel);
		links.add(link);
	}

}
