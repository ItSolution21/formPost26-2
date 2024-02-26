package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EmployeeServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String name = request.getParameter("ename");
		String fname = request.getParameter("fname");
		String motherName = request.getParameter("mname");
		
		System.out.println(name +  " "  + fname  + " "  + motherName);
		out.println(name +  " "  + fname  + " "  + motherName);
		}

}
