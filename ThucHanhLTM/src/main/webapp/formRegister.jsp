<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
 	<form name="formRegister" action="themUserServlet" method="post">
		
		   <table border="0">
      
			 <tr>
                <td>Roles</td>
                <td>
                    <input type="text" size="20" name="roles">
                </td>
            </tr>
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
                <td>Firstname</td>
                <td>
                    <input type="text" size="20" name="firstname">
                </td>
            </tr>
            <tr>
                <td>Lastname</td>
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