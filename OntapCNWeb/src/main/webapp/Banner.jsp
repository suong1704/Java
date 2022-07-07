<%@page import="Model.BEAN.NhanVienBEAN"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Banner</title>
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
<%
		ArrayList<NhanVienBEAN> list = (ArrayList<NhanVienBEAN>)request.getAttribute("list");
%>
<a href="CheckLoginServlet?action=xemnv" target="main" >Xem Nhân viên</a>
<!-- <a href="CheckLoginServlet?action=xemnv" target="main" >Xem Nhân viên</a> -->
<a href="XemPB.jsp" target="main">Xem Phòng ban</a>
<a href="TimKiem.jsp" target="main">Tìm kiếm</a>

</body>
</html>