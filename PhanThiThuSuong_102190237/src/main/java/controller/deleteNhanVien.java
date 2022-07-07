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
import model.bo.xemNhanvienBO;

/**
 * Servlet implementation class deleteNhanVien
 */
@WebServlet("/deleteNhanVien")
public class deleteNhanVien extends HttpServlet {
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
		System.out.println("DA vao servlet cua deleteNhanVien");
		//doGet(request, response);
		String destination = null;
	
		xemNhanvienBO _xemNhanvienBO = new xemNhanvienBO();
		ArrayList<nhanvien> _nhanvien = null;
	
	
		_nhanvien = _xemNhanvienBO.getNhanvien();
		request.setAttribute("_nhanvien",_nhanvien);
		destination = "/deleteNhanVien.jsp";
		RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
		rd.forward(request, response);
	}

}
