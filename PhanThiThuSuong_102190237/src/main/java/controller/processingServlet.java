package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class processingServlet
 */
@WebServlet("/processingServlet")
public class processingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String action = request.getParameter("action");
		if (action.equals("addNhanvien")) {
            request.getRequestDispatcher("formAddNhanvien.jsp").forward(request, response);
		}
		else if (action.equals("xemPhongBan")) {
            request.getRequestDispatcher("xemPhongBan").forward(request, response);
            
		}
		else if (action.equals("updatePhongBan")) {
            request.getRequestDispatcher("xemPhongBan_update").forward(request, response);
            
		}
		else if (action.equals("deleteNhieuNhanVien")) {
            request.getRequestDispatcher("deleteNhieuNhanVien").forward(request, response);
            
		}
		else if (action.equals("deleteNhanVien")) {

            request.getRequestDispatcher("deleteNhanVien").forward(request, response);
            
		}
		else if (action.equals("searchNhanVien")) {

            request.getRequestDispatcher("formSearch.jsp").forward(request, response);
            
		}
		else if (action.equals("index")) {
            request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
