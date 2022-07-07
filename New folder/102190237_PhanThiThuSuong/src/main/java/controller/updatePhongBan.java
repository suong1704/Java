package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bo.themNhanvienBO;
import model.bo.xemPhongBanBO;

/**
 * Servlet implementation class updatePhongBan
 */
@WebServlet("/updatePhongBan")
public class updatePhongBan extends HttpServlet {
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
		
		int IDPB = Integer.parseInt(request.getParameter("IDPB"));
		String	TENPB  = request.getParameter("TENPB");

		String	MOTA  = request.getParameter("MOTA");
		xemPhongBanBO _xemPhongBanBO = new xemPhongBanBO();
		_xemPhongBanBO.updatePhongBan(IDPB, TENPB, MOTA);
		 response.sendRedirect("xemPhongBan_update");
		
	}
}
