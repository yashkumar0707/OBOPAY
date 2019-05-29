<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FORM CONFIRMATION</title>
</head>
<body>
<%=request.getParameter("rollno")%>
<%if(request.getParameter("action").equalsIgnoreCase("insert"))
		{web.insert.Insert(request.getParameter("rollno"),request.getParameter("name"));
		out.println("Added");
		}
		else if(request.getParameter("action").equalsIgnoreCase("update"))
			{web.update.up(request.getParameter("rollno"),request.getParameter("name")); 
			out.println("UPDATED");
			}
%>
</body>
</html>