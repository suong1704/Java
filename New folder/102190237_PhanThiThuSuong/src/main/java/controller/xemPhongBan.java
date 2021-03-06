package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.nhanvien;
import model.bean.phongban;
import model.bo.xemNhanvienBO;
import model.bo.xemPhongBanBO;

/**
 * Servlet implementation class xemPhongBan
 */
@WebServlet("/xemPhongBan")
public class xemPhongBan extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("DA vao servlet");
		//doGet(request, response);
		String destination = null;
	
		xemPhongBanBO _xemPhongBanBO = new xemPhongBanBO();
		ArrayList<phongban> _phongban = null;
	

		_phongban = _xemPhongBanBO.getPhongban();
		request.setAttribute("_phongban",_phongban);
		destination = "/xemPhongBan.jsp";
		RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
		rd.forward(request, response);
	}


}
