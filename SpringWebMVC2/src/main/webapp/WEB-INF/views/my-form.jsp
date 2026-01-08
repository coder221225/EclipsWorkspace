<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>My Form</h2>
<form action="submitForm" method="post">
Name:<input type="text" name="name" /></br></br><!-- field name should be same as in Bean class if using @ModelAttribute in controller  -->
Email Id:<input type="text" name="email"/></br></br><!-- field name should be same as in Bean class if using @ModelAttribute in controller  -->
Phone No:<input type="text" name="phoneno"/></br></br><!-- field name should be same as in Bean class if using @ModelAttribute in controller  -->
<input type="submit" value="Submit" name="submit"/>
</form>
</body>
</html>