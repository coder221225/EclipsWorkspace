<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title></title>
		<link rel="stylesheet" href="css/style.css"/>
	</head>
	<body class="body_bg">
		<h4>Register here</h4>
		
		<c:if>
			<c:if test="${not empty successMsg}">
				<h4 style="color: green;">${successMsg}</h4>
			</c:if>
			<c:if test="${not empty errorMsg}">
							<h4 style="color: red;">${errorMsg}</h4>
						</c:if>
		</c:if>
		<form action="regForm" method="post">
		Name:<input type="text" name="name"/></br></br>
		Email:<input type="text" name="email"/></br></br>
		Password:<input type="password" name="password"/></br></br>
		Phone:<input type="text" name="phone"/></br></br>
		<input type="submit"  value="Register"/>
		</form>
		</br></br>
		 If Already Registered...<a href="loginPage">Login Here</a></body>
		
		
</html>