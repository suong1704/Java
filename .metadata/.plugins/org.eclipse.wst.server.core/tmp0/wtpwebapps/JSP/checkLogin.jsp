<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	
	String address = "Gia Lai";
	if ("suong".equals(username) && !("123456".equals(password))){
		request.setAttribute("address", address);
		RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
		rd.forward(request, response);
	}
	else {
		response.sendRedirect("login.jsp");
	}
%>
	