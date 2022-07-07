<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>
</head>
<body>
<% String username =(String)session.getAttribute("username") ;%>

 <form action="searchServlet" method="post">
 	<h1>Welcome, <%= username %></h1>
 	LastName:<input type="text" size="20" name="lastname"><br>
 	<input type="submit" value="Search">
    <input type="reset"  value="reset">
 </form>
 
</body>
</html>