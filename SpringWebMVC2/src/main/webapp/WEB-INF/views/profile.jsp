<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome:User</h2>
<!--  <h3>Name:${model_name}</h3></br>
<h3>Email:${model_email}</h3></br>
<h3>Phone:${model_phone}</h3>-->
<!-- <h3>Name:${model_user.getName()}</h3></br>
<h3>Email:${model_user.getEmail()}</h3></br>
<h3>Phone:${model_user.getPhoneno()}</h3>-->
<h3>Name:${user.getName()}</h3></br>
<h3>Email:${user.getEmail()}</h3></br>
<h3>Phone:${user.getPhoneno()}</h3>
</body>
</html>