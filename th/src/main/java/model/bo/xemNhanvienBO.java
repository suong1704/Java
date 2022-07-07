package model.bo;

import java.util.ArrayList;

import model.bean.nhanvien;
import model.dao.xemNhanvienDAO;

public class xemNhanvienBO {
	xemNhanvienDAO xemNhanvienDAO = new xemNhanvienDAO();
	public ArrayList<nhanvien> getNhanvien(){
		return xemNhanvienDAO.getNhanVien();
	}
	public ArrayList<nhanvien> getNhanvienByIDPB(int IDPB){
		return xemNhanvienDAO.getNhanVienByIDPB(IDPB);
	}
	public void deleteNhanVien(int idnv) {
		xemNhanvienDAO.deleteNhanVien(idnv);
	}
	public ArrayList<nhanvien> searchNhanVien(String search, String name){
		return xemNhanvienDAO.searchNhanVien(search,name);
	}
}
