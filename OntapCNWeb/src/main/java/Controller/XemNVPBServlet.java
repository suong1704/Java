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
import Model.BO.NhanVienBO;
import Model.BO.PhongBanBO;

/**
 * Servlet implementation class XemNVPBServlet
 */
@WebServlet("/XemNVPBServlet")
public class XemNVPBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public XemNVPBServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String idpb = request.getParameter("idpb");
		String destination;
		NhanVienBO nhanVienBO = new NhanVienBO();
		ArrayList<NhanVienBEAN> list = new ArrayList<NhanVienBEAN>();
		try {
			list = nhanVienBO.getNVByPB(idpb);
			request.setAttribute("list",list);
			destination="/XemNVPB.jsp";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
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
