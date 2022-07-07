<%@page import="Model.Wife"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h1>1</h1>
	<table>
	<%
		ArrayList<Wife> listwife = (ArrayList<Wife>)request.getAttribute("listwife");
		for (int i = 0 ; i < listwife.size() ; i++){
	%>
		<tr>
		<td>1</td>
			<td><%= listwife.get(i).getName() %></td>
			<td><%= listwife.get(i).getAddress() %></td>
			<td><%= listwife.get(i).isAlive() %></td>
		</tr>
	<% } %>
	
	</table>
</body>
</html>