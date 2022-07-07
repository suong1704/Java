<%@page import="Model.BEAN.NhanVien"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>
	<%
		ArrayList<NhanVien> listNV = (ArrayList<NhanVien>)request.getAttribute("listNV");
		for (int i = 0 ; i < listNV.size() ; i++){
	%>
		<tr>
		<td>1</td>
			<td><%= listNV.get(i).getName() %></td>
			<td><%= listNV.get(i).getAddress() %></td>
			<td><%= listNV.get(i).isAlive() %></td>
		</tr>
	<% } %>
	
	</table>
</body>
</html>