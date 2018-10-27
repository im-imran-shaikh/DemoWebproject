<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    padding: 8px;
    text-align: left;
    border-bottom: 1px solid #ddd;
}

tr:nth-child(even) {background-color: #f2f2f2;}
</style>

</head>
<body>

<h1>Retrieve data from database in jsp</h1>
<table border="1">
<tr>
<td><b>first name</b></td>
<td><b>last name</b></td>
<td><b>country</b></td>
<td><b>message</b></td>

<%!

String driverClass="org.h2.Driver";
String url="jdbc:h2:tcp://localhost/~/imran-sarwar project";
String uname="imran";
String pass="imran";
String sql="select * from feedback";


%>

<%

try{
	String firstname= request.getParameter("firstname");
	String lastname = request.getParameter("lastname");
	String country = request.getParameter("country");
	String message = request.getParameter("message");
			
	
	Class.forName(driverClass);
	Connection con=DriverManager.getConnection(url,uname,pass);
	Statement ps=con.createStatement();
	/* ps.setString(1, firstname);
	ps.setString(2, lastname);
	ps.setString(3, country);
	ps.setString(4, message);
	 */
ResultSet rs=ps.executeQuery(sql);
 while(rs.next())
 {
	

	
%>
<tr >
<td><%=rs.getString("first_name") %></td>
<td><%=rs.getString("last_name") %></td>
<td><%=rs.getString("country") %></td>
<td><%=rs.getString("message") %></td>
</tr>




<% 	
 }
	con.close();
			 ps.close();
			 rs.close();
}
catch(Exception e)
{
	out.print(e);
}
%>

</table>





</body>
</html>