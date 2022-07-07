<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page language="java" import="java.util.ArrayList" %>
<%@ page language="java" import="model.bean.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Xem User</title>
</head>
<body>
	
		<table border="1" width="100%">
		<tr><th> USER </th> <th> FIRSTNAME </th> <th> LASTNAME </th> <th> ROLES </th><th> UPDATE </th><th> DELETE </th> </tr>
	<%
		ArrayList<admin> _user=(ArrayList<admin>)request.getAttribute("_user");
		if(_user == null){
	%>
		<p> No Result is matched! </p>
	<%		
		}
		else{
		for(int i = 0; i < _user.size(); i++){
	%>

		<tr>
			<td><%= _user.get(i).getUsername() %></td>
			<td><%= _user.get(i).getFirstName() %></td>
			<td><%= _user.get(i).getLastName() %></td>
			<td><%= _user.get(i).getRoles() %></td>
			<td><a href="updateUserServlet?action=<%=_user.get(i).getUsername() %>">XXX</a></td>
			<td><a href="deleteUserServlet?action=<%=_user.get(i).getUsername() %>">XXX</a></td>
		</tr>
	
	<% }} %>
		
		
	</table>
	<a href = Search.jsp?action=index>Tro ve Search</a>
</body>
</html>

