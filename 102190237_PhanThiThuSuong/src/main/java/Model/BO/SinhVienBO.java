package Model.BO;

import java.util.ArrayList;

import Model.BEAN.sinhvien;
import Model.DAO.AdminDAO;
import Model.DAO.SinhVienDAO;

public class SinhVienBO {
	public ArrayList<sinhvien> searchSinhVien(String khoa){
		SinhVienDAO sinhVienDAO= new SinhVienDAO();
		return sinhVienDAO.searchSinhVien(khoa);
	}
	public boolean isValidSearchSV(String khoa) {
		SinhVienDAO sinhVienDAO=new SinhVienDAO();
		return sinhVienDAO.isValidSearchSV(khoa);
	}
	public boolean isValidDeleteSinhVien(int maso) {
		SinhVienDAO sinhVienDAO= new SinhVienDAO();
		return sinhVienDAO.isValidDeleteSinhVien(maso);
	}
}
