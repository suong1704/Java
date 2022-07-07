
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <title>Thêm Nhân Viên</title>
    <style>
        h1{
            display: block;
            text-align: center;
        }
        .input{
            margin: 10px 0;
            text-align: center;
        }
    </style>
</head>
<body>
<form action="AddNVServlet" method="post" name="formThemNV">
	
    <div align="center">
    <table>
        <tr>
            <td><label for="" padding="10px"><b>Ma nhan vien</b></label></td>
            <td><input type="text" name="IDNV" value="" ></td>
        </tr>
        <tr>
            <td><label for=""><b>Ho ten</b></label></td>
            <td><input type="Text" name="HOTEN" ></td>
        </tr>
        <tr>
            <td><label for=""><b>Ma phong ban</b></label></td>
            <td><input type="Text" name="IDPB" ></td>
        </tr>
        <tr>
            <td><label for=""><b>Dia chi</b></label></td>
            <td><input type="Text" name="DIACHI" ></td>
        </tr>
    </table>
    <br>
    <input type="submit" name="them" value="OK" >
    </div>
    
</form>
<a href="javascript:history.back()">Back</a>
</body>
</html>