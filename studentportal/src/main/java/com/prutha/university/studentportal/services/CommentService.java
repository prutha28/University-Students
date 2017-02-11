package com.prutha.university.studentportal.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.prutha.university.studentportal.database.Database;
import com.prutha.university.studentportal.model.Comment;
import com.prutha.university.studentportal.model.Message;

public class CommentService {

//	private Map<Integer, Message> messages = Database.getMessages();
//	
//	public CommentService(){
//	}
//	
//	public List<Comment> getAllComments(int messageId) {
//		Map<Integer, Comment> commentsForMessage = messages.get(messageId).getComments();
//		return new ArrayList<Comment>(commentsForMessage.values());
//	}
//	
//	public Comment getComment( int messageId, int commentId){
//		Map<Integer, Comment> commentsForMessage = messages.get(messageId).getComments();
//		return commentsForMessage.get(commentId);
//	}
//
//	public Comment addComment( int messageId, Comment comment){
//		Map<Integer, Comment> commentsForMessage = messages.get(messageId).getComments();
//		int id = commentsForMessage.size() + 1 ;
//		comment.setId(id);
//		// Update the comments field of the message.
//		commentsForMessage.put(id, comment);
//		// Update the database
////		comments.put(id, comment);
//		messages.get(messageId).setComments(commentsForMessage);
////		Database.setCommnets(commentsForMessage);
//		return comment;
//	}
//	
//	public Comment updateComment( int messageId, int commentId, Comment comment){
//		Map<Integer, Comment> commentsForMessage = messages.get(messageId).getComments();
//		
//		if( comment.getId() <= 0 ){
//			// No Comment exists
//			return null;
//		}
//		comment.setId(commentId);
//		commentsForMessage.put(commentId, comment);
////		comments.put(commentId, comment);
////		Database.setCommnets(commentsForMessage);
//		messages.get(messageId).setComments(commentsForMessage);
//
//		return comment;
//	}
//	
//	public Comment removeComment( int messageId, int commentId){
//		Map<Integer, Comment> commentsForMessage = messages.get(messageId).getComments();
//		Comment removed = commentsForMessage.remove(commentId);
////		Database.setCommnets(commentsForMessage);
//		messages.get(messageId).setComments(commentsForMessage);
//
//		return removed;
//	}
	
	
	private Map<Integer, Message> messages = Database.getMessages();
	
	public List<Comment> getAllComments(int messageId) {
		Map<Integer, Comment> comments = messages.get(messageId).getComments();
		return new ArrayList<Comment>(comments.values());
	}
	
	public Comment getComment(int messageId, int commentId) {
		Map<Integer, Comment> comments = messages.get(messageId).getComments();
		return comments.get(commentId);
	}
	
	public Comment addComment(int messageId, Comment comment) {
		Map<Integer, Comment> comments = messages.get(messageId).getComments();
		comment.setId(comments.size() + 1);
		comments.put(comment.getId(), comment);
		return comment;
	}
	
	public Comment updateComment(int messageId, Comment comment) {
		Map<Integer, Comment> comments = messages.get(messageId).getComments();
		if (comment.getId() <= 0) {
			return null;
		}
		comments.put(comment.getId(), comment);
		return comment;
	}
	
	public Comment removeComment(int messageId, int commentId) {
		Map<Integer, Comment> comments = messages.get(messageId).getComments();
		return comments.remove(commentId);
	}
		
}
