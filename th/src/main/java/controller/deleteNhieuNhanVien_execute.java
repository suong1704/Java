package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bo.xemNhanvienBO;

/**
 * Servlet implementation class deleteNhieuNhanVien_execute
 */
@WebServlet("/deleteNhieuNhanVien_execute")
public class deleteNhieuNhanVien_execute extends HttpServlet {
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
			String[] idnv = request.getParameterValues("IDNV");
			xemNhanvienBO _xemNhanvienBO = new xemNhanvienBO();
			
			for(String o : idnv) {
				System.out.println(o);
			}

		}

}
