<%@page import="Model.BEAN.VacxinBEAN"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang chủ</title>
    <style>
        a:link , a:visited{
            /*margin: 20px 5px;*/
            display: block;
            display: inline-flex;
            font-weight: bold;
            text-decoration: none;
            color: black;
            padding: 10px 15px;
        }
        a:hover{
            border-bottom: 5px solid navy;
            color: navy;
        }
        .div{

            font-size: small ;
            text-align: left;
            font-weight: inherit;

            /*border: 1px solid lightgrey;*/
            background: gainsboro;
            padding: 0px 5px;
            margin: 1px 0;

        }
    </style>
</head>
<body>
<a href="ThemVX.jsp" target="" >Thêm Vacxin</a>
<a href="TimKiem.jsp" target="">Tìm Kiếm VX</a>
<a href="TimKiem.jsp" target="">Lịch Sử Tiêm</a>
<form action="" method="post">
	<table border="1" width="100%">
	<caption>Thông tin VacXin</caption>
	<TR><TH>MaVX</TH><TH>TenVX</TH><TH>SoMui</TH><TH>MOTA</TH><TH>GiaVX</TH><TH>Hang SX</TH><TH>Sửa</TH></TR>
	<%
		ArrayList<VacxinBEAN> list = (ArrayList<VacxinBEAN>)request.getAttribute("list");
		for(int i=0 ; i < list.size() ; i++){
	%>
	<tr>
		<td><%=list.get(i).getMaVX() %></td>
		<td><%=list.get(i).getTenVX() %></td>
		<td><%=list.get(i).getSoMui() %></td>
		<td><%=list.get(i).getMoTa() %></td>
		<td><%=list.get(i).getGiaVX()%></td>
		<td><%=list.get(i).getTenHangVX()%></td>
		<td align="center"><a href="updateVXServlet?id=<%=list.get(i).getMaVX()%>">xxx</a></td>
	</tr>
	<%} %>
	</table>
</form>
</body>
</html>