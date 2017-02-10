package com.prutha.university.studentportal.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Term {

	private String termId;
	private String semester;
	private Date fromDate;
	private Date toDate;
	
	public Term(){
		
	}
	
	public Term(String termId, String semester, Date fromDate, Date toDate) {
		this.termId = termId;
		this.semester = semester;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}

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
