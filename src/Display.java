package com.schoolmanagementt.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.schoolmanagementt.entity.Student;
import com.schoolmanagementt.service.Studentservice;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/display")
public class Display extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    Studentservice service = new Studentservice();
	    List<Student> students = service.FetchAll();

	    resp.setContentType("text/html");
	    PrintWriter ps = resp.getWriter();

	    ps.println("<!DOCTYPE html>");
	    ps.println("<html><head><title>Student List</title>");
	    ps.println("<style>");
	    ps.println("body { font-family: Arial; background-color: #f4f4f4; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; }");
	    ps.println(".container { background-color: #fff; padding: 20px; border-radius: 10px; box-shadow: 0 0 10px rgba(0,0,0,0.1); }");
	    ps.println("table { width: 100%; border-collapse: collapse; margin-top: 20px; }");
	    ps.println("th, td { border: 1px solid #ddd; padding: 10px; text-align: left; }");
	    ps.println("th { background-color: #f2f2f2; }");
	    ps.println("</style>");
	    ps.println("</head><body>");
	    ps.println("<div class='container'>");
	    ps.println("<h1>Students Table</h1>");
	    ps.println("<table><thead><tr><th>ID</th><th>Name</th><th>Age</th><th>Actions</th></tr></thead><tbody>");

	    for (Student student : students) {
	        ps.println("<tr>");
	        ps.println("<td>" + student.getId() + "</td>");
	        ps.println("<td>" + student.getName() + "</td>");
	        ps.println("<td>" + student.getAge() + "</td>");
	        ps.println("<td>");
	        ps.println("<a href='edit.jsp?id=" + student.getId() + "'>Edit</a> | ");
	        ps.println("<a href='delete.jsp?id=" + student.getId() + "'>Delete</a>");
	        ps.println("</td>");
	        ps.println("</tr>");
	    }

	    ps.println("</tbody></table></div></body></html>");
	}
}