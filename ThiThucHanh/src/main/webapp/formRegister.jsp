<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="themUserServlet" method='post'>
        <table border="0">
      

            <tr>
                <td>Username</td>
                <td>
                    <input type="text" size="20" name="username">
                </td>
            </tr>
            <tr>
                <td>Password</td>
                <td>
                    <input type="text" size="20" name="password">
                </td>
            </tr>
            <tr>
                <td>firstname</td>
                <td>
                    <input type="text" size="20" name="firstname">
                </td>
            </tr>
            <tr>
                <td>lastname</td>
                <td>
                    <input type="text" size="20" name="lastname">
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