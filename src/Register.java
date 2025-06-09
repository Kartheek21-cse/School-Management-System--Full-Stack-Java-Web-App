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
@WebServlet("/save")
public class Register extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws IOException, ServletException{
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		int age=Integer.parseInt(req.getParameter("age"));
		int standard=Integer.parseInt(req.getParameter("standard"));
		Student s=new Student();
		s.setId(id);
		s.setAge(age);
		s.setName(name);
		s.setStandard(standard);
		Studentservice s1=new Studentservice();
		int res=s1.save(s);
		if(res!=0) {
			PrintWriter p=resp.getWriter();
			p.print("<h1>Data Is Saved</h1>");
			RequestDispatcher rd=req.getRequestDispatcher("welcome.jsp");
			rd.forward(req, resp);
		}
		else {
			PrintWriter p=resp.getWriter();
			p.print("<h1>Data Is Not Saved</h1>");
		}
	}
}