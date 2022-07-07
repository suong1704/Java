<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="formLogin" action="CheckLoginServlet" method="post">
		<table border="0">
			<caption>Đăng nhập hệ thống</caption>
            <tr>
                <td>Tên đăng nhập</td>
                <td>
                    <input type="text"  name="username">
                </td>
            </tr>
            <tr>
                <td>Mật khẩu</td>
                <td>
                    <input type="text" name="password">
                </td>
            </tr>
            <tr>
                <td colspan="1"><input type="submit" value="Đăng nhập" bgcolor="blue">
                <input type="reset"  value="Hủy" bgcolor="blue"></td>
            </tr>
        </table>
	</form>
</body>
</html>