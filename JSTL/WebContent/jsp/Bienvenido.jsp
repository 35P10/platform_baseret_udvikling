<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.Date"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bienvenido</title>
</head>
<body>
	<h1>Bienvenido</h1>
	<br>
	Nombre: <c:out value="${bean.name}"></c:out>
	<br>
	Apellido: <c:out value="${bean.apellido}"></c:out>
	<br>
	Fecha: <c:out value="${bean.date}"></c:out>
	<br>
</body>
</html>