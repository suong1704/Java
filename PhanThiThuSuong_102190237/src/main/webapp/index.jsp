<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index</title>
</head>
<body>
	<ul>
		<li><a href="xemNhanvienServlet">Xem nhan vien</a></li>
		<li><a href="processingServlet?action=addNhanvien">Them nhan vien</a></li>
		<li><a href="processingServlet?action=xemPhongBan">Xem thong tin phong ban</a></li>
		<li><a href="processingServlet?action=updatePhongBan">Sua Thong tin phong ban</a></li>
		<li><a href="processingServlet?action=deleteNhanVien">Xoa 1 nhan vien</a></li>
		<li><a href="processingServlet?action=deleteNhieuNhanVien">Xoa nhieu nhan vien</a></li>
		<li><a href="processingServlet?action=searchNhanVien">Tim kiem nhan vien</a></li>
	</ul>
</body>
</html>