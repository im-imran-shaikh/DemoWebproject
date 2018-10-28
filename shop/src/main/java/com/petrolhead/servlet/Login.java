package com.petrolhead.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petrolhead.Dao.loginDatabase;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String uname= request.getParameter("uname");
		String pass= request.getParameter("pass");
		
		loginDatabase dao = new loginDatabase();
		if(dao.test(uname, pass))
		{
			out.print("thank you for login");
		}

	}
}
