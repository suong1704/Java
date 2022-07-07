<%@page import="java.util.ArrayList"%>
<%@page import="Model.BEAN.sinhvien"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sách sinh viên</title>
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
</head>
<body>
	<form name="formDanhSach" action="DanhSachServlet" method="post">
		<select name="khoa">
        <option>CNTT</option>
        <option>Hoa</option>
        <option>Moi Truong</option>
        <option>Vat Ly</option>
    </select>
   <button type="button" onclick="location.href='formLogin.jsp';" class="csw-btn-button" >Click tại đây</button>
    <a href="formLogin.jsp" class="btn btn-primary btn-block">Create New Account</a>

    <input type="submit" value="Xem" bgcolor="blue">
    <input type="button" value="Thêm mới" bgcolor="blue" onclick="location.href='formLogin.jsp'">
    <table border="1" width="100%">
    
		<tr><th> MSSV </th> <th> Họ và tên </th> <th> Giới tính </th> <th> Khoa </th> <th> Sửa </th><th> Xóa </th> </tr>
	<%
		ArrayList<sinhvien> listSinhVien=(ArrayList<sinhvien>)request.getAttribute("listSinhVien");
		if(listSinhVien == null){
	%>
		
	<%		
		}
		else{
		for(int i = 0; i < listSinhVien.size(); i++){
	%>

		<tr>
			<td><%= listSinhVien.get(i).getMaso() %></td>
			<td><%= listSinhVien.get(i).getHoten() %></td>
			<td><%= listSinhVien.get(i).getGioitinh() %></td>
			<td><%= listSinhVien.get(i).getKhoa() %></td>
			<td><a href="sendDataUpdateServlet?maso=<%=listSinhVien.get(i).getMaso() %>">XXX</a></td>
			<td><a href="deleteServlet?maso=<%=listSinhVien.get(i).getMaso() %>">XXX</a></td>
		</tr>
	
	<% }} %>
		
		
	</table>
	</form>
</body>
</html>