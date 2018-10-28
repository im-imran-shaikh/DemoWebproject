package com.petrolhead.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petrolhead.Dao.SignupDatabase;

/**
 * Servlet implementation class Signup
 */
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	PrintWriter out = response.getWriter();
	response.setContentType("text/html");
	
	String email = request.getParameter("email");
	String uname = request.getParameter("uname");
	String pass = request.getParameter("pass");
	String rpass = request.getParameter("rpass");
	
	SignupDatabase dao = new SignupDatabase();
	if(dao.check(email, uname, pass, rpass))
	{
		if(dao.rs != 0)
		{
			out.print("you have successfuly register");
		}
		else
		{
			out.print("something wrong please try again");
		}
	}
	
		
	}

}
