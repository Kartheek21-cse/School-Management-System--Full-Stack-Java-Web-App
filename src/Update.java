package com.schoolmanagementt.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.schoolmanagementt.entity.Student;
import com.schoolmanagementt.service.Studentservice;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/update")
public class Update extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    int id=Integer.parseInt(req.getParameter("id"));
    String name=req.getParameter("name");
    int age=Integer.parseInt(req.getParameter("age"));
    int standard=Integer.parseInt(req.getParameter("standard"));
    Student s=new Student(id,name,age,standard);
	Studentservice ss=new Studentservice();
	int res=ss.update(s);
	if(res!=0) {
		RequestDispatcher rd=req.getRequestDispatcher("welcome.jsp");
		rd.forward(req, resp);
	}
	else {
		PrintWriter ps=resp.getWriter();
		ps.print("<h1>Update not successfull</h1>");
	}
	
}
}
