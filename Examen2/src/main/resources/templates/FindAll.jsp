<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="/js/postrequest.js"></script>
      <script src="/js/getrequest.js"></script>
      
<script>
$(document).ready(function(){
	$.each(function(i)) {
		  alert(this.name);
		});
});
</script>  
      
      
      
	
</head>
<body>

	<table border="1" cellspacing="0" cellpadding="5">
		<tr>
			<th>Id</th>
			<th>Nombre</th>
			<th>Descripcion</th>
		</tr>
	</table>
	<a href="/CategoryRestService/Add">Añadir</a>
	

</body>
</html>