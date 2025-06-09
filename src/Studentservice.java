package com.schoolmanagementt.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.schoolmanagementt.entity.Student;

public class Studentservice {
 private static String url="jdbc:postgresql://localhost:5432/studentmanagement?user=postgres&password=123";
 private static Connection conn;
 static {
	 try {
	 Class.forName("org.postgresql.Driver");
	 conn=DriverManager.getConnection(url);
 }
 catch(Exception e){
	 e.printStackTrace();
 }
}
 public int save(Student s) {
	 int res=0;
	 try {
	 String sql="Insert into students values(?,?,?,?)";
	 PreparedStatement pstm=conn.prepareStatement(sql);
	 pstm.setInt(1, s.getId());
	 pstm.setString(2, s.getName());
	 pstm.setInt(3, s.getAge());
	 pstm.setInt(4, s.getStandard());
	 res=pstm.executeUpdate();
 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
	 return res;
}
 public List<Student> FetchAll() {
	 List<Student>st1=new ArrayList<Student>();
	 String sql="select * from students";
	 try {
		Statement stm=conn.createStatement();
		ResultSet rs=stm.executeQuery(sql);
		while(rs.next()) {
			Student st=new Student(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
			st1.add(st);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 return st1;
 }
 public int update(Student s) {
	 int res=0;
	 String sql="update students set name=?,age=?,standard=? where id=?";
	 try {
		PreparedStatement pstm=conn.prepareStatement(sql);
		pstm.setString(1,s.getName());
		pstm.setInt(2, s.getAge());
		pstm.setInt(3, s.getStandard());
		pstm.setInt(4, s.getId());
		res=pstm.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return res; 
 }
 public int delete(int id) {
	 int res=0;
	 String sql="delete from students where id=?";
	 try {
		PreparedStatement pstm=conn.prepareStatement(sql);
		pstm.setInt(1, id);
		res=pstm.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 return res;
 }
}
