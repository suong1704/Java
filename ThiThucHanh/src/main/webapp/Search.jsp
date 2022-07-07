<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% String username =(String)session.getAttribute("username"); %>
Welcome, <%= username %>
<form action="searchUserServlet" method='post'>
        <table border="0">
            <caption>Search</caption>
            <tr>
              
                <td><input type="text" size="20" name="name"></td>
            </tr>
            
                <td colspan="1"><input type="submit" value="OK">
                <input type="reset"  value="reset"></td>
            </tr>
        </table>


    </form>
</body>
</html>