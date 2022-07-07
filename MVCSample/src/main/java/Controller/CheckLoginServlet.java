package Controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.CheckLoginBO;
import Model.Wife;

/**
 * Servlet implementation class CheckLoginServlet
 */
@WebServlet("/CheckLoginServlet")
public class CheckLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @throws IOException 
	 * @throws ServletException 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		String destination = null;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		CheckLoginBO checkLoginBO = new CheckLoginBO();
		ArrayList<Wife> listwife = null;
				try {
					if (checkLoginBO.isValidUser(username, password)) {
							listwife = checkLoginBO.getWifeList(username);
							request.setAttribute("listwife", listwife);
							destination = "/Welcome.jsp";
							RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
							rd.forward(request, response);
						}
					
					else {
						destination = "/Login.jsp";
						RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
						rd.forward(request, response);
					}
				}
					catch (Exception e) {
						// TODO: handle exception
					}
		
			
	}

}
