<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Login Page</title>
</head>
<body>
	<form name="form1" action="CheckLoginServlet" method="post">
		Username: <input type="text" name="username" />
		Password: <input type="password" name="password" />
		<input type="submit" value = "ok">
		<input type="reset" value = "reset">
	</form>
</body>
</html>