<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CHECK</title>
</head>
<body>
<% String name=request.getParameter("name");
	String pass=(request.getParameter("pass"));
	if(name.trim().equals(""))
	{
		out.print("NO BLANK ALLOWED");
	}
	else if((pass).trim().equals(""))
	{
		out.print("NO BLANK ALLOWED");
	}
	else
		{String s=web.hello3.check(name);
		out.print(s);
		}
%>

</body>
</html>