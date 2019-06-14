<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% if(request.getParameter("txt").equalsIgnoreCase("yash@gmail.com") && request.getParameter("txt1").equalsIgnoreCase("yash1234"))
	out.println("LOGIN SUCCESSFUL");
	else
		out.println("LOGIN NOT SUCCESSFUL");
	
%>
</body>
</html>