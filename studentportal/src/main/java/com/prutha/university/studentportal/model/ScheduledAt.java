package com.prutha.university.studentportal.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ScheduledAt {

	private String courseId;
	private String slotId;
	private String roomNo;
	
	public ScheduledAt(){
		
	}
	
	public ScheduledAt(String courseId, String slotId, String roomNo) {
		super();
		this.courseId = courseId;
		this.slotId = slotId;
		this.roomNo = roomNo;
	}

	public String getCourseId() {
		return courseId;
	}
	
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	
	public String getSlotId() {
		return slotId;
	}
	
	public void setSlotId(String slotId) {
		this.slotId = slotId;
	}
	
	public String getRoomNo() {
		return roomNo;
	}
	
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	
}
