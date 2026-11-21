<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="it.exolab.model.Utente" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Conferma Registrazione</title>
	</head>
	<body>
	
		<% Utente utente = (Utente) request.getAttribute("user"); %>
	
		<h2>Riepilogo Dati</h2>
	
		<p><strong>Nome : </strong> <%= utente.getNome() %></p>
		<p><strong>Email : </strong><%= utente.getEmail() %></p>
	
	</body>
</html>