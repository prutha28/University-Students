package com.prutha.university.studentportal.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author prutha
 * This class holds the number of creditpoints for each grade.
 * e.g. A+ = 4.3 , A = 4.0 etc. 
 */
@XmlRootElement
public class Gradepoint {

	private char grade;
	private int creditPoints;
	
	public Gradepoint(){
		
	}
	
	public Gradepoint(char grade, int creditPoints) {
		super();
		this.grade = grade;
		this.creditPoints = creditPoints;
	}

	public char getGrade() {
		return grade;
	}
	
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	public int getCreditPoints() {
		return creditPoints;
	}
	
	public void setCreditPoints(int creditPoints) {
		this.creditPoints = creditPoints;
	}
}
