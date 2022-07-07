package Controller;


import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Model.BEAN.VacxinBEAN;

import Model.BO.VacxinBO;

/**
 * Servlet implementation class AddVXServlet
 */
@WebServlet("/AddVXServlet")
public class AddVXServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddVXServlet() {
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
		int MaVX = Integer.parseInt(request.getParameter("MaVX"));
		String TenVX = request.getParameter("TenVX");
		int SoMui = Integer.parseInt(request.getParameter("SoMui"));
		String MoTa = request.getParameter("MoTa");
		int GiaVX = Integer.parseInt(request.getParameter("GiaVX"));
		String TenHangVX = request.getParameter("TenHangVX");
		System.out.println(MaVX);
		System.out.println(TenHangVX+GiaVX);
		VacxinBO vacxinBO= new VacxinBO();
		ArrayList<VacxinBEAN> list = new ArrayList<VacxinBEAN>();
				try {
					if(vacxinBO.isValidAddVX(MaVX,TenVX,SoMui,MoTa,GiaVX,TenHangVX)) {
						list = vacxinBO.getAllVacxin();
						request.setAttribute("list", list);
						destination="/Index.jsp";
						RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
						rd.forward(request, response);
					}
					else {
						destination ="/Loi.jsp";
						RequestDispatcher rDispatcher = getServletContext().getRequestDispatcher(destination);
						rDispatcher.forward(request, response);
					}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
