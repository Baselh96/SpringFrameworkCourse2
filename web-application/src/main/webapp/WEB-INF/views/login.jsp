<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Yahoo from JSP</title>
</head>
<body>
	<center>
		<p style="color: red">${error}</p>
		<form action="/login.do" method="post">
			Name: 
			<input type="text" name="name" />
			<br/>
			Passwort: 
			<input type="password" name="passwort" />
			<br/>
			<input type="submit" value="login"/>
		</form>
	</center>
</body>
</html>