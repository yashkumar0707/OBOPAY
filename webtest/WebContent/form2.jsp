<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FORM</title>
</head>
<body>
<%=request.getParameter("rollno") %>
THE STUDENT IS UPDATED :<%=web.update.up(request.getParameter("rollno"),request.getParameter("name")) %>
</body>
</html>