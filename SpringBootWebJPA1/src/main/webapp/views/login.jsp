<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title></title>
		<link rel="stylesheet" href="css/style.css"/>
	</head>
	<body class="body_bg">
		<h4>Login here</h4>
		
		<c:if>
			<c:if test="${not empty errorMsg}">
							<h4 style="color: red;">${errorMsg}</h4>
						</c:if>
		</c:if>
		<form action="loginForm" method="post">
		Email:<input type="text" name="email"/></br></br>
		Password:<input type="password" name="password"/></br></br>
		    		<input type="submit"  value="Login"/>
		</form>
		</br></br>
		 If Not Registered...<a href="regPage">Register Here</a>
		
	</body>
</html>