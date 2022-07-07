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
import Model.BO.NhanVienBO;

/**
 * Servlet implementation class AddNVServlet
 */
@WebServlet("/AddNVServlet")
public class AddNVServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNVServlet() {
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
		String IDNV = request.getParameter("IDNV");
		String HOTEN = request.getParameter("HOTEN");
		String IDPB = request.getParameter("IDPB");
		String DIACHI = request.getParameter("DIACHI");
		NhanVienBO nhanVienBO= new NhanVienBO();
		ArrayList<NhanVienBEAN> list = null;
		try {
			if(nhanVienBO.isValidAddNV(IDNV,HOTEN,IDPB,DIACHI)) {
				list = nhanVienBO.getAllNV();
				request.setAttribute("list", list);
				destination="/XemNV.jsp";
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
