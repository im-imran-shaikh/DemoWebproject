package com.petrolhead.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class loginDatabase 
{
	String driverClass="org.h2.Driver";
	String url="jdbc:h2:tcp://localhost/~/imran-sarwar project";
	String uname="imran";
	String pass="imran";
	String sql="select * from customer where username=? and password=?";
	
	public boolean test(String username,String password)
	{
		try {
			Class.forName(driverClass);
			Connection con=DriverManager.getConnection(url,uname,pass);
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				return true;
			}
		
		}catch(Exception e)
		{
			System.out.print(e);
		}
		
		
		return false;
	}
}
