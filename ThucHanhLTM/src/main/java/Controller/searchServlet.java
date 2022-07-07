package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import javax.print.attribute.standard.Destination;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.BEAN.admin;
import Model.BO.AdminBO;
import Model.BO.CheckLoginBO;

/**
 * Servlet implementation class searchServlet
 */
@WebServlet("/searchServlet")
public class searchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchServlet() {
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
		String destination = null;
		String lastname = request.getParameter("lastname");
		AdminBO adminBO = new AdminBO();
		ArrayList<admin> listAdmins = new ArrayList<admin>();
		
		try {
			if (adminBO.isValidSearhAdmin(lastname)) {
				//gui name sang trang Search.jsp
				listAdmins = adminBO.searchAdmin(lastname);
				request.setAttribute("listAdmins", listAdmins);
				destination = "/Data.jsp";
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			}
			else {
//				destination = "/searchKhongThanhCong.jsp";
//				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
//				rd.forward(request, response);
			} 
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
