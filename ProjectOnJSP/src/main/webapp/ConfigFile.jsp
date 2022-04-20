<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% out.println("Wlcome"+" "+request.getParameter("name")); 
	//String fname=config.getInitParameter("College");
	out.print("Your's college is :"+config.getInitParameter("College"));%>
</body>
</html>