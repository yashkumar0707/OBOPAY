<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FORM CONFIRMATION</title>
</head>
<body>
THE STUDENT IS CONFIRMED:${param.rollno} ${param.name}
<br/>
FAV LANGUAGE : <%=request.getParameter("fav")%>
<br/> 
</body>
</html>