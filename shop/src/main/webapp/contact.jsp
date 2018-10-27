<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="./css/contact.css" rel="stylesheet">
</head>
<body>


	<div class="container">
		<form action="Contact" method="post">

			<label for="fname">First Name</label> <input type="text" id="fname"
				name="firstname" placeholder="Your name.."> <label
				for="lname">Last Name</label> <input type="text" id="lname"
				name="lastname" placeholder="Your last name.."> <label
				for="country">Country</label> <select id="country" name="country">
				<option value="australia">Australia</option>
				<option value="canada">Canada</option>
				<option value="usa">USA</option>
				<option value="usa">India</option>
			</select> <label for="subject">Message</label>
			<textarea id="subject" name="message" placeholder="Write something.."
				style="height: 200px"></textarea>

			<input type="submit" value="Submit">

		</form>
	</div>


</body>
</html>