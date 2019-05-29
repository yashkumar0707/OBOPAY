<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>checkbox</title>
</head>
<body>
STUDENT ENROLLED:<%=request.getParameter("rollno")%> <%=request.getParameter("name") %>
	<br/>
FAVOURITE LANGUAGE: <br/>
<% String s[]=request.getParameterValues("fav");
	for (int i =0; i<s.length;i++)
		out.print(s[i]+"\t");
%>
</body>
</html>