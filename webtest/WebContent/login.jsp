<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if(request.getParameter("username").equalsIgnoreCase("user") && request.getParameter("password").equalsIgnoreCase("pass")) 
	out.println("LOGIN SUCCESSFUL");
	else
	out.println("UNSUCCESSFUL");
%>

</body>
</html>