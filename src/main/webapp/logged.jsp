<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="it.exolab.model.Utente" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Pagina di Benvenuto</title>
	</head>
	<body>
	
		<% Utente utente = (Utente) request.getAttribute("utenteEsistente"); %>
	
		<h2>Benvenuto utente : <%= utente.getNome() %></h2>
		<h4>Email utente : <%= utente.getEmail() %></h4>
	
	</body>
</html>