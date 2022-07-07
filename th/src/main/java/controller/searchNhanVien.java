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
import model.bo.themNhanvienBO;
import model.bo.xemNhanvienBO;

/**
 * Servlet implementation class searchNhanVien
 */
@WebServlet("/searchNhanVien")
public class searchNhanVien extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name"); //la gia tri search
		String search = request.getParameter("search");//search ve?


		xemNhanvienBO _xemNhanvienBO = new xemNhanvienBO();
		ArrayList<nhanvien> _nhanvien = null;
	

		_nhanvien = _xemNhanvienBO.searchNhanVien(search,name);

		request.setAttribute("_nhanvien",_nhanvien);
		String destination = "/xemNhanvien.jsp";
		RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
		rd.forward(request, response);

	}

}
