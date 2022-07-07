package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.admin;
import model.bo.CheckLoginBO;

/**
 * Servlet implementation class searchUserServlet
 */
@WebServlet("/searchUserServlet")
public class searchUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		ArrayList<admin> _user = null;
		CheckLoginBO _checkLoginBO = new CheckLoginBO();
		_user = _checkLoginBO.searchUser(name);
		
		request.setAttribute("_user",_user);
		request.setAttribute("nameForSearch",name);
		String destination = "/xemUser.jsp";
		RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
		rd.forward(request, response);
		
	}

}
