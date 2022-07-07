package model.bo;

import model.dao.xemNhanvienDAO;

public class themNhanvienBO {
	public void themNhanVien(int IDNV, String HOTEN, int IDPB, String DIACHI) {
		xemNhanvienDAO _xemNhanvienDAO = new xemNhanvienDAO();
		_xemNhanvienDAO.themNhanVien(IDNV, HOTEN, IDPB, DIACHI);
	}
}
