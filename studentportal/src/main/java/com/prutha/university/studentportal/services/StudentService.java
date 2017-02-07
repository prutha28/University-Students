package com.prutha.university.studentportal.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.prutha.university.studentportal.model.Student;
import com.prutha.university.studentportal.utils.ConnectionUtil;
import com.prutha.university.studentportal.utils.DateUtils;

public class StudentService {

	private static Connection conn = ConnectionUtil.getConnectionInstance(); 

	public static void main(String[] args) throws SQLException{
		Student s = getStudent("johndoe");
	}
	
	public static List<Student> getAllStudents() throws SQLException{
		List<Student> students = new ArrayList<Student>();
		String SQL = "SELECT * FROM Students";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);
		
		while( rs.next()){
			Student s = new Student();
			s.setFirstName(rs.getString("fname"));
			s.setLastName(rs.getString("lname"));
			s.setPreferredName(rs.getString("preferred_name"));
			s.setCgpa(rs.getFloat("cgpa"));
			s.setDateOfBirth(rs.getDate("dob"));
		}
		
		return students;
	}
	
	
	public static Student getStudent( String unityId) throws SQLException{

		String studentSQL = "SELECT * FROM Student s WHERE s.s_unity_id = ?";
		ResultSet rs = null;
		Student s = new Student();
		
		PreparedStatement stmt = conn.prepareStatement(studentSQL);
		stmt.setString(1, unityId);
		rs = stmt.executeQuery();
		
		while( rs.next()){
			s.setStudentId(rs.getString("s_id"));
			s.setCgpa(rs.getFloat("cgpa"));
			s.setAdvisorId(rs.getString("advisor_id"));
			s.setDegree(rs.getString("degree_type"));
			s.setUnityId(unityId);
		}
		
		String personSQL = "SELECT * FROM Person p WHERE p.unity_id = ?"; 
		stmt = conn.prepareStatement(personSQL);
		stmt.setString(1, unityId);
		rs = stmt.executeQuery();
		
		while( rs.next()){
			s.setFirstName((rs.getString("fname")));
			s.setLastName(rs.getString("lname"));
			s.setPreferredName(rs.getString("preferred_name"));
			s.setDateOfBirth(rs.getDate("dob"));
			s.setGender(rs.getString("gender"));
			s.setPassword(rs.getString("pwd"));
		}
		
//		System.out.println(s);
		return s;
	}

	public boolean deleteStudent(String unityId){
		return false;
	}
	
	public boolean addStudent(Student s) throws SQLException{
		
		boolean flag = false;
		PreparedStatement stmt = null;
		
		// Insert into person table
		String SQL = "INSERT INTO Person(unity_id, fname, lname, preferred_name, gender, dob, pwd ) "
				+ "VALUES(?,?,?,?,?,?,?)";
		stmt = conn.prepareStatement(SQL);
		stmt.setString(1, s.getUnityId());
		stmt.setString(2, s.getFirstName());
		stmt.setString(3, s.getLastName());
		stmt.setString(4, s.getPreferredName());
		stmt.setString(5, s.getGender());
		Date javaDate = s.getDateOfBirth();
		java.sql.Date sqlDate = DateUtils.getSQLDate(javaDate);
		stmt.setDate(6, sqlDate);
		stmt.setString(7, s.getPassword());
		int affected = stmt.executeUpdate();
		
		if( affected == 1){
			flag = true;
		}
		
		// Insert into person table
		SQL = "INSERT INTO Student(s_unity_id, fname, lname, preferred_name, gender, dob, pwd ) "
					+ "VALUES(?,?,?, ?,?,?,?)";
		stmt = conn.prepareStatement(SQL);
		
		return flag;
	}
	
	public boolean updateStudent(Student s){
		return false;
	}
}
