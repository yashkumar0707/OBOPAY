<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CONFIRMATION</title>
</head>
<% String lang = request.getParameter("fav");
	Cookie ck= new Cookie("favlang",lang);
	ck.setMaxAge(60*60*24*365);
	response.addCookie(ck);
%>
<body>
FAVOURITE LANGUAGE HAS BEEN SET TO: ${param.fav}
<br/><br/>
<a href="cookies-homepage.jsp" >HOMEPAGE</a>
</body>
</html>