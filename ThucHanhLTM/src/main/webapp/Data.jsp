<%@page import="java.util.ArrayList"%>
<%@page import="Model.BEAN.admin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Data</title>
</head>
<body>

	<table border="1" width="100%">
		<tr><th> ROLES </th> <th> USERNAME </th> <th> FIRSTNAME </th> <th> LASTNAME </th> <th> UPDATE </th><th> DELETE </th> </tr>
	<%
		ArrayList<admin> listAdmins=(ArrayList<admin>)request.getAttribute("listAdmins");
		if(listAdmins == null){
	%>
		<p> No Result is matched! </p>
	<%		
		}
		else{
		for(int i = 0; i < listAdmins.size(); i++){
	%>

		<tr>
			<td><%= listAdmins.get(i).getRoles() %></td>
			<td><%= listAdmins.get(i).getUsername() %></td>
			<td><%= listAdmins.get(i).getFirstName() %></td>
			<td><%= listAdmins.get(i).getLastName() %></td>
			<td><a href="sendDataUpdateServlet?username=<%=listAdmins.get(i).getUsername() %>">XXX</a></td>
			<td><a href="deleteServlet?username=<%=listAdmins.get(i).getUsername() %>">XXX</a></td>
		</tr>
	
	<% }} %>
		
		
	</table>
	<a href = formSearch.jsp>Search</a>
</body>
</html>