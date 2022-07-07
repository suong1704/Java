package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.bo.themUserBO;

/**
 * Servlet implementation class themUserServlet
 */
@WebServlet("/themUserServlet")
public class themUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String destination = null;
		
	
		String	username  = request.getParameter("username");
		//int IDPB = Integer.parseInt(request.getParameter("IDPB"));
		String	password  = request.getParameter("password");
		String	firstname  = request.getParameter("firstname");
		String	lastname  = request.getParameter("lastname");
		themUserBO _themUserBO = new themUserBO();
		_themUserBO.themUser(username,password,firstname,lastname);
		System.out.println("da vao BO de them user");
		 response.sendRedirect("formLogin.jsp");
		
	}

}
