<%@page import="Model.BEAN.admin"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>
	<% admin ad =(admin)request.getAttribute("ad") ;%>
	<form name="formUpdate" action="updateServlet" method="post">
		
		   <table border="0">
      
			 <tr>
                <td>Roles</td>
                <td>
                    <input type="text" size="20" name="roles" value="<%=ad.getRoles()%>">
                </td>
            </tr>
            <tr>
                <td>Username</td>
                <td>
                    <input type="text" size="20" name="username" readonly value="<%=ad.getUsername()%>">
                </td>
            </tr>
            <tr>
                <td>Lastname</td>
                <td>
                    <input type="text" size="20" name="lastname" value="<%=ad.getLastName()%>">
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