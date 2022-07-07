package Model.BO;

import java.util.ArrayList;

import Model.BEAN.VacxinBEAN;
import Model.DAO.VacxinDAO;

public class VacxinBO {
	public ArrayList<VacxinBEAN> getAllVacxin() {
		VacxinDAO vacxinDAO= new VacxinDAO();
		return vacxinDAO.getAllVacxin();
	}
	public boolean isValidAddVX(int MaVX ,String TenVX,int SoMui,String MoTa,int GiaVX,String TenHangVX) {
		VacxinDAO vacxinDAO= new VacxinDAO();
		return vacxinDAO.isValidAddVX(MaVX, TenVX, SoMui, MoTa, GiaVX, TenHangVX);
	}
}
