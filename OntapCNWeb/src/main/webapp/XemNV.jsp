
<%@page import="Model.BEAN.NhanVienBEAN"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nhân Viên</title>
<style>
.csw-btn-button {
  cursor: pointer;
  font-size: 16px;
  /*padding: 10px 35px;
  /*color: #ffffff !important;*/
  /*border-radius: 5px;
  /*background: #9B6A1D;*/
  border: 1px solid ;
  transition: 0.4s;
}
.csw-btn-button:hover {
  background: "blue";
} 
</style>
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
<a href="XemNV.jsp" target="" >Xem Nhân viên</a>
<a href="XemPBServlet?action=xempb" target="">Xem Phòng ban</a>
<a href="TimKiem.jsp" target="">Tìm kiếm</a>

<form action="" method="post">
<!-- <input type="submit" name="themnv" value="Thêm Nhân Viên" >  -->
	 <input type="button" name="themnv" onClick="location.href='ThemNV.jsp'" value="Thêm Nhân Viên" src="ThemNV.jsp"> 
</form>
<form action="deleteNVServlet" method="post">
	<table border="1" width="100%">
	<caption>Thông tin bảng nhân viên</caption>
	<TR><TH>IDNV</TH><TH>Ho Ten</TH><TH>IDPB</TH><TH>Dia chi</TH><TH>Xóa</TH></TR>
	<%
		ArrayList<NhanVienBEAN> list = (ArrayList<NhanVienBEAN>)request.getAttribute("list");
		for(int i=0 ; i < list.size() ; i++){
	%>
	<tr>
		<td><%=list.get(i).getIDNV() %></td>
		<td><%=list.get(i).getHOTEN() %></td>
		<td><%=list.get(i).getIDPB() %></td>
		<td><%=list.get(i).getDIACHI() %></td>
		<td align="center"><input type="checkbox" name="check[]" value="<%= list.get(i).getIDNV()%>"></td>
	</tr>
	<%} %>
	</table>
    <input type="submit" value="Xóa Nhân Viên đã chọn">
</form>
</body>
</html>