package com.petrolhead.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petrolhead.Dao.ContactDatabaseConfiguration;

/**
 * Servlet implementation class Contact
 */
public class Contact extends HttpServlet {


	String driverClass="org.h2.Driver";
	String url="jdbc:h2:tcp://localhost/~/imran-sarwar project";
	String uname="imran";
	String pass="imran";
	String sql="insert into feedback values(?,?,?,?)";
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String firstname =request.getParameter("firstname");
		String lastname =request.getParameter("lastname");
		String country =request.getParameter("country");
		String message =request.getParameter("message");
		
		/*ContactDatabaseConfiguration dao= new ContactDatabaseConfiguration();
		if(dao.test(firstname, lastname, country, message))
		{
			if(dao.rs>0)
			{
				out.write("thank you for your valuble feedback");
			}
		}*/
		try {
			Class.forName(driverClass);
			Connection con=DriverManager.getConnection(url,uname,pass);
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, firstname);
			ps.setString(2, lastname);
			ps.setString(3, country);
			ps.setString(4, message);
			
		int rs=ps.executeUpdate();
		 if(rs != 0)
		 {
			 out.write("thank you for your valuble feedback");
		 }
			
			
			
			
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		
		
	}

}
