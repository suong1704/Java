package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.BEAN.admin;
import Model.BEAN.sinhvien;
import Model.BO.AdminBO;
import Model.BO.SinhVienBO;

/**
 * Servlet implementation class DanhSachServlet
 */
@WebServlet("/DanhSachServlet")
public class DanhSachServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanhSachServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String destination = null;
		String khoa = request.getParameter("khoa");
		SinhVienBO sinhVienBO = new SinhVienBO();
		ArrayList<sinhvien> listSinhVien = new ArrayList<sinhvien>();
		try {
			if(sinhVienBO.isValidSearchSV(khoa)) {
				//gui name sang trang Search.jsp
				listSinhVien = sinhVienBO.searchSinhVien(khoa);
				request.setAttribute("listSinhVien", listSinhVien);
				destination = "/formDanhSach.jsp";
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			}
			else {
				destination = "/searchKhongThanhCong.jsp";
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			}
				
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
