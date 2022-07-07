<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page language="java" import="java.util.ArrayList" %>
<%@ page language="java" import="model.bean.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Xem nhan vien</title>
</head>
<body>
	<table>
		<table border="1" width="100%">
		<tr><th> IDNV </th> <th> Ho Ten </th> <th> IDPB </th> <th> DIACHI </th> </tr>
	<%
		ArrayList<nhanvien> _nhanvien=(ArrayList<nhanvien>)request.getAttribute("_nhanvien");
		if(_nhanvien == null){
	%>
		<p> null </p>
	<%		
		}
		else{
		for(int i = 0; i < _nhanvien.size(); i++){
	%>

		<tr>
			<td><%= _nhanvien.get(i).getIDNV() %></td>
			<td><%= _nhanvien.get(i).getName() %></td>
			<td><%= _nhanvien.get(i).getIDPB() %></td>
			<td><%= _nhanvien.get(i).getDIACHI() %></td>
		</tr>
	
	<% }} %>
		
		
	</table>
	<a href = processingServlet?action=index>Tro ve trang chu</a>
</body>
</html>

