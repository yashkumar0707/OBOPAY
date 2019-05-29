<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MAIN</title>
</head>
<body>
<h3> TRAINING PORTAL</h3>
<% 	String lang="java";
	Cookie ck[]=request.getCookies();
	if(ck!=null)
	for(Cookie temp:ck)
	{
		if("favlang".equalsIgnoreCase(temp.getName()))
		{
			lang=temp.getValue();
			break;
		}
			
	}
%>
<h4>GET BOOOKS FOR <%=lang %></h4>
<br/>
<ul>
<li> ........</li>
<li>.............</li>
<li>.........</li>
</ul>
<br/>
<ul>
</ul>
<h4> GET MATERIAL FOR <%=lang %></h4>
<ul>
<li> ..............</li>
<li> .............</li>
<li> ................</li>
</ul>
<a href = "cookies.html">SET PREFERENCE</a>
</body>
</html>