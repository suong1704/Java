package model.bo;

import java.util.ArrayList;

import model.bean.phongban;
import model.dao.xemPhongBanDAO;



public class xemPhongBanBO {
	xemPhongBanDAO xemPhongBanDAO = new xemPhongBanDAO();
	public ArrayList<phongban> getPhongban(){
		return xemPhongBanDAO.getPhongBan();
	}
	public phongban getPhongBanByIDPB(int idpb) {
		return xemPhongBanDAO.getPhongBanByID(idpb);
	}
	public void updatePhongBan(int idpb,String tenpb, String mota) {
		xemPhongBanDAO.updatePhongBan(idpb,tenpb,mota);
	}
}
