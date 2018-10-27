package com.petrolhead.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ContactDatabaseConfiguration {

	String driverClass="org.h2.Driver";
	String url="jdbc:h2:tcp://localhost/~/imran-sarwar project";
	String uname="imran";
	String pass="imran";
	String sql="insert into feedback values(?,?,?,?)";
	
	public int rs;
	
	public boolean test(String firstname,String lastname,String country,String message)
	{
		try {
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,uname,pass);
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, firstname);
		ps.setString(2, lastname);
		ps.setString(3, country);
		ps.setString(4, message);
		
	 rs=ps.executeUpdate();
	 if(rs>0)
	 {
		 return true;
	 }
		
		
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return false;
	}
}
