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
 * Servlet implementation class findNVServlet
 */
@WebServlet("/findNVServlet")
public class findNVServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public findNVServlet() {
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
		String radio = request.getParameter("radio");
		String thongtin = request.getParameter("thongtin");
		NhanVienBO nhanVienBO= new NhanVienBO();
		ArrayList<NhanVienBEAN> list = new ArrayList<NhanVienBEAN>();
		try {
			if(radio=="IDNV") {
				list = nhanVienBO.getNVByIDNV(thongtin);
				request.setAttribute("list", list);
				destination="/XemNV1.jsp"; 
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			}
			else if(radio=="HOTEN") {
				list = nhanVienBO.getNVByHoten(thongtin);
				request.setAttribute("list", list);
				destination="/XemNV1.jsp"; 
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			}
			else  {
				list = nhanVienBO.getNVByDC(thongtin);
				request.setAttribute("list", list);
				destination="/XemNV1.jsp"; 
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
