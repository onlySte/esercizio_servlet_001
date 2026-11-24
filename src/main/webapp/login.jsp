<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Login</title>
	</head>
	<body>
	
		
	<% String erroreLogin = (String) request.getAttribute("erroreLogin"); %>
	
		<h3> <%= erroreLogin %></h3>
	
		<form action="login" method="get">
		
			<div>
				<label>Username : </label>
				<input type="text" name="nome"/>
			</div>
			<div>
				<label>Email : </label>
				<input type="email" name="email"/>
			</div>
		
			<button type="submit">Invia</button>
		</form>	
	
	
	</body>
</html>