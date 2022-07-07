<%@page import="Model.BEAN.NhanVienBEAN"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="" method="post">
	<table border="1" width="100%">
	<caption>Thông tin bảng nhân viên</caption>
	<TR><TH>IDNV</TH><TH>Ho Ten</TH><TH>IDPB</TH><TH>Dia chi</TH></TR>
	<%
		ArrayList<NhanVienBEAN> list = (ArrayList<NhanVienBEAN>)request.getAttribute("list");
		for(int i=0 ; i < list.size() ; i++){
	%>
	<tr>
		<td><%=list.get(i).getIDNV() %></td>
		<td><%=list.get(i).getHOTEN() %></td>
		<td><%=list.get(i).getIDPB() %></td>
		<td><%=list.get(i).getDIACHI() %></td>
	</tr>
	<%} %>
	</table>
</form>
<a href="javascript:history.back()">Back</a>
</body>
</html>