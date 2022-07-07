package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import Model.BEAN.AdminBEAN;
import Model.BEAN.NhanVienBEAN;
import Model.BO.AdminBO;
import Model.BO.NhanVienBO;

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
		String action = request.getParameter("login");
         request.getRequestDispatcher("XemNV.jsp").forward(request, response);
		
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
		NhanVienBO nhanVienBO= new NhanVienBO();
		ArrayList<NhanVienBEAN> list = null;
		try {
			if(adminBO.isExistUser(username, password)) {
				list = nhanVienBO.getAllNV();
				request.setAttribute("list", list);
				/* destination ="CheckLoginServlet?login"; */
				 destination="/XemNV.jsp"; 
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			}
			else {
				destination ="/Login.jsp";
				RequestDispatcher rDispatcher = getServletContext().getRequestDispatcher(destination);
				rDispatcher.forward(request, response);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
