<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
DONE:
<% 	
	out.print(request.getParameter("name") +"<br/>");
	out.print(web.insertajax.Insert(request.getParameter("name"),request.getParameter("pass")));
%>
</body>
</html>