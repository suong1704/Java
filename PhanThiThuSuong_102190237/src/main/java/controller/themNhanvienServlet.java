package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bo.themNhanvienBO;

/**
 * Servlet implementation class themNhanvienServlet
 */
@WebServlet("/themNhanvienServlet")
public class themNhanvienServlet extends HttpServlet {
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
		
		int IDNV = Integer.parseInt(request.getParameter("IDNV"));
		String	HOTEN  = request.getParameter("HOTEN");
		int IDPB = Integer.parseInt(request.getParameter("IDPB"));
		String	DIACHI  = request.getParameter("DIACHI");
		themNhanvienBO _themNhanvienBO = new themNhanvienBO();
		_themNhanvienBO.themNhanVien(IDNV, HOTEN, IDPB, DIACHI);
		 response.sendRedirect("xemNhanvienServlet");
		
	}

}
