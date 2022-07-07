<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="themNhanvienServlet" method='post'>
        <table border="0">
            <caption>Them Nhan Vien</caption>
            <tr>
                <td>IDNV</td>
                <td><input type="text" size="20" name="IDNV"></td>
            </tr>
            <tr>
                <td>HOTEN</td>
                <td>
                    <input type="text" size="20" name="HOTEN">
                </td>
            </tr>
            <tr>
                <td>IDPB</td>
                <td>
                    <input type="text" size="20" name="IDPB">
                </td>
            </tr>
            <tr>
                <td>DIACHI</td>
                <td>
                    <input type="text" size="20" name="DIACHI">
                </td>
            </tr>
            <tr>
                <td colspan="1"><input type="submit" value="OK">
                <input type="reset"  value="reset"></td>
            </tr>
        </table>


    </form>
</body>
</html>