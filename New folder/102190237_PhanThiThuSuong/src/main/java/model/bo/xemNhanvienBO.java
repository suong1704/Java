package model.bo;

import java.util.ArrayList;

import model.bean.nhanvien;
import model.dao.xemNhanvienDAO;

public class xemNhanvienBO {
	xemNhanvienDAO _xemNhanvienDAO = new xemNhanvienDAO();
	public ArrayList<nhanvien> getNhanvien(){
		return _xemNhanvienDAO.getNhanVien();
	}
	public ArrayList<nhanvien> getNhanvienByIDPB(int IDPB){
		return _xemNhanvienDAO.getNhanVienByIDPB(IDPB);
	}
	public void deleteNhanVien(int idnv) {
		_xemNhanvienDAO.deleteNhanVien(idnv);
	}
	public ArrayList<nhanvien> searchNhanVien(String search, String name){
		return _xemNhanvienDAO.searchNhanVien(search,name);
	}
}
