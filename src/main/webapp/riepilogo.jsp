<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Riepilogo</title>
	</head>
	<body>
	
	<h2>Scriptlet</h2>
	
	<% 
		String nomeGet = (String) request.getAttribute("nomeDoGet");
	   String emailGet = (String) request.getAttribute("emailDoGet");
	%>
	
	<% 
		String nomePost = (String) request.getAttribute("nomeDoPost");
		String emailPost = (String) request.getAttribute("emailDoPost");
	%>
	
	<p>Nome : <%= nomeGet %></p>
	<p>Email : <%= emailGet %></p>
	
	
	<p><%= nomePost %></p>
	<p><%= emailPost %></p>
	
	
	
	<h2>Expression Lenguage</h2>
	
		<p> ${nomeDoGet} </p>
		<p> ${emailDoGet}</p>
	
		<p> ${nomeDoPost} </p>
		<p> ${emailDoPost} </p>
	</body>
</html>