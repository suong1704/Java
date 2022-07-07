package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.BEAN.VacxinBEAN;
import Model.BO.AdminBO;
import Model.BO.VacxinBO;


/**
 * Servlet implementation class CheckLoginServlet
 */
@WebServlet("/CheckLoginServlet")
public class CheckLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String destination;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		AdminBO adminBO= new AdminBO();
		VacxinBO vacxinBO= new VacxinBO();
		ArrayList<VacxinBEAN> list = new ArrayList<VacxinBEAN>();
		try {
			if(adminBO.isExistUser(username, password)) {
				list=vacxinBO.getAllVacxin();
				request.setAttribute("list", list);
				destination="/Index.jsp"; 
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			}
			else {
				System.out.println("no");
				destination ="/Login.jsp";
				RequestDispatcher rDispatcher = getServletContext().getRequestDispatcher(destination);
				rDispatcher.forward(request, response);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
