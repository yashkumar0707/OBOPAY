<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript" >
function fn()
	{
		var str2=${param.txt}; 
		var str1=${param.txt1} ;
		var regx=/([a-zA-Z0-9\.-]+)@([a-zA-Z]+).([a-zA-Z]+)/;
		if((str2).trim()=="")
		{
			document.getElementById("txt3").innerHTML="NO BLANK ALLOWED";
			
		}
		else if((str1).trim()=="")
		{
			document.getElementById("txt3").innerHTML="NO BLANK ALLOWED";
		
		}
		else if (regx.test(str2)==false)
			{
				document.getElementById("txt3").innerHTML="INCORRECT USERNMAE";
				
		
	}
	}
</script>
<h1 id="txt3">YASH</h1>
</body>
</html>