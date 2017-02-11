package com.prutha.university.studentportal.database;

import java.util.HashMap;
import java.util.Map;

import com.prutha.university.studentportal.model.Address;
import com.prutha.university.studentportal.model.Comment;
import com.prutha.university.studentportal.model.Course;
import com.prutha.university.studentportal.model.Department;
import com.prutha.university.studentportal.model.Email;
import com.prutha.university.studentportal.model.Faculty;
import com.prutha.university.studentportal.model.Gradepoint;
import com.prutha.university.studentportal.model.LectureSlot;
import com.prutha.university.studentportal.model.Message;
import com.prutha.university.studentportal.model.Phone;
import com.prutha.university.studentportal.model.Profile;
import com.prutha.university.studentportal.model.Student;

/**
 * A Dummy database class that holds some dummy data
 * @author prutha
 *
 */
public class Database {

	private static Map<Integer, Message> messages = new HashMap<Integer, Message>();
	private static Map<Integer, Profile> profiles = new HashMap<Integer, Profile>();
	private static Map<Integer, Student> students = new HashMap<Integer, Student>();
	private static Map<Integer, Course> courses = new HashMap<Integer, Course>();
	private static Map<Integer, Faculty> faculties = new HashMap<Integer, Faculty>();
	private static Map<Integer, Address> addresses = new HashMap<Integer, Address>();
	private static Map<Integer, Phone> phones = new HashMap<Integer, Phone>();
	private static Map<Integer, Email> emails = new HashMap<Integer, Email>();
	private static Map<Integer, Gradepoint> grades = new HashMap<Integer, Gradepoint>();
	private static Map<Integer, LectureSlot> schedules = new HashMap<Integer, LectureSlot>();
	private static Map<Integer, Department> departments = new HashMap<Integer, Department>();
	private static Map<Integer, Comment> commnets = new HashMap<Integer, Comment>();
	
	public static Map<Integer, Comment> getCommnets() {
		return commnets;
	}

	public static Map<Integer, Department> getDepartments() {
		return departments;
	}

	public static Map<Integer, Message> getMessages() {
		return messages;
	}
	
	public static void setMessages(Map<Integer, Message> messages) {
		Database.messages = messages;
	}

	public static void setProfiles(Map<Integer, Profile> profiles) {
		Database.profiles = profiles;
	}

	public static void setStudents(Map<Integer, Student> students) {
		Database.students = students;
	}

	public static void setCourses(Map<Integer, Course> courses) {
		Database.courses = courses;
	}

	public static void setFaculties(Map<Integer, Faculty> faculties) {
		Database.faculties = faculties;
	}

	public static void setAddresses(Map<Integer, Address> addresses) {
		Database.addresses = addresses;
	}

	public static void setPhones(Map<Integer, Phone> phones) {
		Database.phones = phones;
	}

	public static void setEmails(Map<Integer, Email> emails) {
		Database.emails = emails;
	}

	public static void setGrades(Map<Integer, Gradepoint> grades) {
		Database.grades = grades;
	}

	public static void setSchedules(Map<Integer, LectureSlot> schedules) {
		Database.schedules = schedules;
	}

	public static void setDepartments(Map<Integer, Department> departments) {
		Database.departments = departments;
	}

	public static void setCommnets(Map<Integer, Comment> commnets) {
		Database.commnets = commnets;
	}

	public static Map<Integer, Student> getStudents() {
		return students;
	}

	public static Map<Integer, Course> getCourses() {
		return courses;
	}

	public static Map<Integer, Faculty> getFaculties() {
		return faculties;
	}

	public static Map<Integer, Address> getAddresses() {
		return addresses;
	}

	public static Map<Integer, Phone> getPhones() {
		return phones;
	}

	public static Map<Integer, Email> getEmails() {
		return emails;
	}

	public static Map<Integer, Gradepoint> getGrades() {
		return grades;
	}

	public static Map<Integer, LectureSlot> getSchedules() {
		return schedules;
	}

	public static Map<Integer, Profile> getProfiles() {
		return profiles;
	}

	
}
