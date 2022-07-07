package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.phongban;
import model.bo.xemPhongBanBO;

/**
 * Servlet implementation class xemPhongBan_updateExecute
 */
@WebServlet("/xemPhongBan_updateExecute")
public class xemPhongBan_updateExecute extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int idpb = Integer.parseInt(request.getParameter("action"));
		System.out.println("check IDPB");
		System.out.println(idpb);
		xemPhongBanBO _xemPhongBanBO = new xemPhongBanBO();
		phongban pb = _xemPhongBanBO.getPhongBanByIDPB(idpb);
		request.setAttribute("pb",pb);

		String destination = "/formUpdatePhongBan.jsp";
		RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
		rd.forward(request, response);
	}

}
