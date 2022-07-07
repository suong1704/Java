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
import Model.BEAN.PhongBanBEAN;
import Model.BO.AdminBO;
import Model.BO.NhanVienBO;
import Model.BO.PhongBanBO;

/**
 * Servlet implementation class XemPBServlet
 */
@WebServlet("/XemPBServlet")
public class XemPBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public XemPBServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		String destination;
		PhongBanBO phongBanBO = new PhongBanBO();
		ArrayList<PhongBanBEAN> list = new ArrayList<PhongBanBEAN>();
		try {
			list = phongBanBO.getAllPB();
			request.setAttribute("list",list);
			destination="/XemPB.jsp";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
//		if(action == "xempb") {
//			request.getRequestDispatcher("XemPBServlet").forward(request, response);;
//		
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
//		String destination;
//		PhongBanBO phongBanBO = new PhongBanBO();
//		ArrayList<PhongBanBEAN> list = new ArrayList<PhongBanBEAN>();
//		try {
//			list = phongBanBO.getAllPB();
//			request.setAttribute("list",list);
//			destination="/XemPB.jsp";
//			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
//			rd.forward(request, response);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
	}

}
