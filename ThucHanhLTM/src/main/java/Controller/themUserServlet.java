package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.BO.AdminBO;
import Model.BO.CheckLoginBO;
import Model.DAO.AdminDAO;

/**
 * Servlet implementation class themUserServlet
 */
@WebServlet("/themUserServlet")
public class themUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public themUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//String destination = null;
		String roles = request.getParameter("roles");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String	firstname  = request.getParameter("firstname");
		String	lastname  = request.getParameter("lastname");
		AdminBO adminBO = new AdminBO();
		adminBO.themAdmin(username, password, firstname, lastname, roles);
		response.sendRedirect("formLogin.jsp");
	}
}
