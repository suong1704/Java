<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<%
		String username = request.getParameter("username");
		String address = (String)request.getAttribute("address");
		String temp = (String)session.getAttribute("temp");
	%>
	Welcome = <%=username%> ! <br>
	You are living at= <%=address%> <br>
	Temp = <%=temp%>
</body>
</html>