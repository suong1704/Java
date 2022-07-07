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
		
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String destination = null;
	
		xemPhongBanBO xemPhongBanBO = new xemPhongBanBO();
		ArrayList<phongban> phongban = null;
	

		phongban = xemPhongBanBO.getPhongban();
		request.setAttribute("_phongban",phongban);
		destination = "/xemPhongBan.jsp";
		RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
		rd.forward(request, response);
	}


}
