package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.filters.AddDefaultCharsetFilter;

import Model.BEAN.admin;
import Model.BO.AdminBO;

/**
 * Servlet implementation class sendDataUpdateServlet
 */
@WebServlet("/sendDataUpdateServlet")
public class sendDataUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public sendDataUpdateServlet() {
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
		String destination = null;
		String username = request.getParameter("username");
		AdminBO adminBO = new AdminBO();
		admin ad = adminBO.searchAdminByUsername(username);
		System.out.print("Ho: "+ad.getFirstName());
//		try {
			//nhan username tu form Data -> goi formUpdate -> gui doi tuong admin cho formUpdate)
			request.setAttribute("ad", ad);
			destination = "/formUpdate.jsp";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request, response);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
	}

}
