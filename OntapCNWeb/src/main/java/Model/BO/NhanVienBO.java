package Model.BO;

import java.util.ArrayList;

import Model.BEAN.NhanVienBEAN;
import Model.DAO.NhanVienDAO;

public class NhanVienBO {
	public ArrayList<NhanVienBEAN> getAllNV(){
		NhanVienDAO nhanVienDAO= new NhanVienDAO();
		return nhanVienDAO.getAllNV();
	}
	public boolean isValiddDeleteNV(String IDNV) {
		NhanVienDAO nhanVienDAO= new NhanVienDAO();
		return nhanVienDAO.isValiddDeleteNV(IDNV);
	}
	public void deleteNV(String IDNV) {
		NhanVienDAO nhanVienDAO= new NhanVienDAO();
		nhanVienDAO.deleteNV(IDNV);
	}
	public Boolean isValidAddNV(String IDNV ,String HOTEN,String IDPB,String DIACHI) {
		NhanVienDAO nhanVienDAO = new NhanVienDAO();
		return nhanVienDAO.isValidAddNV(IDNV, HOTEN, IDPB, DIACHI);
	}
	public ArrayList<NhanVienBEAN> getNVByPB(String IDPB) {
		NhanVienDAO nhanVienDAO= new NhanVienDAO();
		return nhanVienDAO.getNVByPB(IDPB);
	}
	public ArrayList<NhanVienBEAN> getNVByIDNV(String IDNV) {
		NhanVienDAO nhanVienDAO= new NhanVienDAO();
		return nhanVienDAO.getNVByIDNV(IDNV);
	}
	public ArrayList<NhanVienBEAN> getNVByHoten(String HOTEN){
		NhanVienDAO nhanVienDAO= new NhanVienDAO();
		return nhanVienDAO.getNVByHoten(HOTEN);
	}
	public ArrayList<NhanVienBEAN> getNVByDC(String DIACHI) {
		NhanVienDAO nhanVienDAO= new NhanVienDAO();
		return nhanVienDAO.getNVByDC(DIACHI);
	}
}
