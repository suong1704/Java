package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.BEAN.admin;
import Model.BO.AdminBO;

/**
 * Servlet implementation class updateServlet
 */
@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateServlet() {
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
		
		String roles = request.getParameter("roles");
		String username = request.getParameter("username");
		String lastname = request.getParameter("lastname");
		AdminBO adminBO = new AdminBO();
		try {
			if (adminBO.isValidUpdateAdmin(username,roles,lastname)) {
				//gui name sang trang Search.jsp
//				ad = adminBO.searhAdminByUsername(username1);
//				request.setAttribute("ad", ad);
				destination = "/formSearch.jsp";
				RequestDispatcher rd1 = getServletContext().getRequestDispatcher(destination);
				rd1.forward(request, response);
			}
			else {
				destination = "/searchKhongThanhCong.jsp";
				RequestDispatcher rd1 = getServletContext().getRequestDispatcher(destination);
				rd1.forward(request, response);
			} 
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
//ad = adminBO.searchAdminByUsername(username);
//System.out.print(ad.getFirstName());
//request.setAttribute("ad", ad);
//destination = "/formUpdate.jsp";
//RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
//rd.forward(request, response);
////Nhan username1 tu formUpdate
//String username1 = request.getParameter("username1");
//String roles = request.getParameter("roles");
//String lastname = request.getParameter("lastname");
//if (adminBO.isValidUpdateAdmin(username1,roles,lastname)) {
//	//gui name sang trang Search.jsp
////	ad = adminBO.searhAdminByUsername(username1);
////	request.setAttribute("ad", ad);
//	destination1 = "/formSearch.jsp";
//	RequestDispatcher rd1 = getServletContext().getRequestDispatcher(destination);
//	rd1.forward(request, response);
//}
//else {
//	destination1 = "/searchKhongThanhCong.jsp";
//	RequestDispatcher rd1 = getServletContext().getRequestDispatcher(destination);
//	rd1.forward(request, response);
//} 
//
//} catch (Exception e) {
//// TODO: handle exception
//}
