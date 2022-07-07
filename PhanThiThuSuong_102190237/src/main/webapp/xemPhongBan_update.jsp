<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page language="java" import="java.util.ArrayList" %>
<%@ page language="java" import="model.bean.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UPDATE PHONG BAN</title>
</head>
<body>
<table border="1" width="100%">
		<caption> Du lieu </caption>
      	<tr><th> IDPB </th> <th> TENPB </th> <th> MOTA </th> <th> UPDATE </th>
      	<%
			ArrayList<phongban> _phongban=(ArrayList<phongban>)request.getAttribute("_phongban");
			if(_phongban == null){
		%>
			<p> null </p>
		<%		
			}
			else{
				for(int i = 0; i < _phongban.size(); i++){
		%>
		<tr>
			<td><%= _phongban.get(i).getIDPB() %></td>
			<td><%= _phongban.get(i).getTENPB() %></td>
			<td><%= _phongban.get(i).getMOTA() %></td>
			<td><a href="xemPhongBan_updateExecute?action=<%= _phongban.get(i).getIDPB()%>">UPDATE</a></td>
		</tr>
	
	<% }} %>
	<a href = processingServlet?action=index>Tro ve trang chu</a>
</body>
</html>