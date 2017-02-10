package com.prutha.university.studentportal.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LectureSlot {

	private String slotId;
	private String dayOfWeek;
	private Date fromDate;
	private Date toDate;

	public LectureSlot(){
	}
	
	public LectureSlot(String slotId, String dayOfWeek, Date fromDate, Date toDate) {
		super();
		this.slotId = slotId;
		this.dayOfWeek = dayOfWeek;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}

	public String getSlotId() {
		return slotId;
	}
	
	public void setSlotId(String slotId) {
		this.slotId = slotId;
	}
	
	public String getDayOfWeek() {
		return dayOfWeek;
	}
	
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	
	public Date getFromDate() {
		return fromDate;
	}
	
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	
	public Date getToDate() {
		return toDate;
	}
	
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
}
