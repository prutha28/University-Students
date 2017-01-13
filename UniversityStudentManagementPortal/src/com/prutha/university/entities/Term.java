package com.prutha.university.entities;

import java.util.Date;

public class Term {

	private String termId;
	private String semester;
	private Date fromDate;
	private Date toDate;
	
	public String getTermId() {
		return termId;
	}
	
	public void setTermId(String termId) {
		this.termId = termId;
	}
	
	public String getSemester() {
		return semester;
	}
	
	public void setSemester(String semester) {
		this.semester = semester;
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
