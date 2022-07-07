<%@page import="Model.BEAN.PhongBanBEAN"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Phong Ban</title>
</head>
<body>

<form action="" method="post">
	<table border="1" width="100%">
	<caption>Danh Sách Phòng Ban</caption>
	<TR><TH>IDPB</TH><TH>Tên Phòng Ban</TH><TH>Mô Tả</TH><TH>Xem Nhân Viên</TH></TR>
	<%
		ArrayList<PhongBanBEAN> list = (ArrayList<PhongBanBEAN>)request.getAttribute("list");
		for(int i=0 ; i < list.size() ; i++){
	%>
	<tr>
		<td><%=list.get(i).getIDPB() %></td>
		<td><%=list.get(i).getTENPB() %></td>
		<td><%=list.get(i).getMOTA() %></td>
		<td align="center"><a href="XemNVPBServlet?idpb=<%=list.get(i).getIDPB()%>">xxx</a></td>
	</tr>
	<%} %>
	</table>
</form>
<a href="javascript:history.back()">Back</a>
</body>
</body>
</html>