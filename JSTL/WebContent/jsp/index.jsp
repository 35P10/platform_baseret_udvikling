<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%--Esto es una directiva para utilizar la clase Date --%>
	<%@ page import="java.util.Date"  %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ecodeup</title>
</head>
<body>
	<h1>Practica 2</h1>
	<form action="/JSTL/MyServet" method="get">
	<p>Nombre: <input type="text" name="nombre"></p>
	<p>Apellido:<input type="text" name="apellido"></p>
	<%--
	Formatted Name: <c:out value="${bean.name}"></c:out>
	<br>
	Formatted Date: <c:out value="${bean.date}"></c:out>
	<br>
	<br>--%>
	<br>
	<br>
	<button type="submit">Enviar</button>
	</form>
	
</body>
</html>