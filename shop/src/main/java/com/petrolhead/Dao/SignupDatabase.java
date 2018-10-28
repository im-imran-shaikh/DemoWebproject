package com.petrolhead.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SignupDatabase {

	String driverClass="org.h2.Driver";
	String url="jdbc:h2:tcp://localhost/~/imran-sarwar project";
	String uname="imran";
	String pass="imran";
	String sql="insert into customer values(?,?,?,?)";
	
	public int rs;
	public boolean check(String email,String username,String password,String repeatpass)
	{
		try {
			Class.forName(driverClass);
			Connection con=DriverManager.getConnection(url,uname,pass);
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, username);
			ps.setString(3, password);
			ps.setString(4, repeatpass);
			
	 rs=ps.executeUpdate();
		 if(rs!=0)
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
