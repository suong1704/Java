<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="AddVXServlet" method="post" name="formThemNV">
	<h1 align="center">Thêm Vacxin</h1>
    <div align="center">
    <table>
        <tr>
 			<td><label for="" padding="10px"><b>Mã VX</b></label></td>
             <td><input type="text" name="MaVX" value="" ></td>
        </tr>
        <tr>
            <td><label for=""><b>Tên VX</b></label></td>
            <td><input type="Text" name="TenVX" ></td>
        </tr>
        <tr>
            <td><label for=""><b>Số Mũi</b></label></td>
            <td><input type="Text" name="SoMui" ></td>
        </tr>
        <tr>
            <td><label for=""><b>MoTa</b></label></td>
            <td><input type="Text" name="MoTa" ></td>
        </tr>
        <tr>
            <td><label for=""><b>Giá</b></label></td>
            <td><input type="Text" name="GiaVX" ></td>
        </tr>
        <tr>
            <td><label for=""><b>Hãng SX</b></label></td>
            <td><input type="Text" name="TenHangVX" ></td>
        </tr>
    </table>
    <br>
    <input type="submit" name="them" value="OK" >
    </div>
    
</form>
<a href="javascript:history.back()">Back</a>
</body>
</html>