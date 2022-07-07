package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Model.BEAN.NhanVienBEAN;
import Model.BO.AdminBO;
import Model.BO.NhanVienBO;

/**
 * Servlet implementation class deleteNVServlet
 */
@WebServlet("/deleteNVServlet")
public class deleteNVServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteNVServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String destination;
		String[] listid = request.getParameterValues("check[]");
		NhanVienBO nhanVienBO= new NhanVienBO();
		ArrayList<NhanVienBEAN> list = null;
		try {
			for(int i= 0 ; i<listid.length ; i++) {
				//nhanVienBO.deleteNV(listid[i]);
				if(nhanVienBO.isValiddDeleteNV(listid[i])) {
					list = nhanVienBO.getAllNV();
					request.setAttribute("list", list);
					destination="/XemNV.jsp";
					RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
					rd.forward(request, response);
				}
				else {
					destination="/Loi.jsp";
					RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
					rd.forward(request, response);
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
