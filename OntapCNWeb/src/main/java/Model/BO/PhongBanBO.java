package Model.BO;

import java.util.ArrayList;

import Model.BEAN.PhongBanBEAN;
import Model.DAO.PhongBanDAO;

public class PhongBanBO {
	public ArrayList<PhongBanBEAN> getAllPB(){
		PhongBanDAO phongBanDAO=new PhongBanDAO();
		return phongBanDAO.getAllPB();
	}
}
