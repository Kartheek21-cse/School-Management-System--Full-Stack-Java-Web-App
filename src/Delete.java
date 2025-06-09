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

@WebServlet("/delete")
public class Delete extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id=Integer.parseInt(req.getParameter("id"));
	Studentservice ss=new Studentservice();
	int res=ss.delete(id);
	if(res!=0) {
		RequestDispatcher rd=req.getRequestDispatcher("welcome.jsp");
		rd.forward(req, resp);
	}
	else {
		PrintWriter pr=resp.getWriter();
		pr.print("<h1>ID not found to Delete</h1>");
		resp.sendRedirect("welcome.jsp");
	}
}
}
