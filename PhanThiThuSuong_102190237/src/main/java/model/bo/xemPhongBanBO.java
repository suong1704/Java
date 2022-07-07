package model.bo;

import java.util.ArrayList;

import model.bean.phongban;
import model.dao.xemPhongBanDAO;



public class xemPhongBanBO {
	xemPhongBanDAO _xemPhongBanDAO = new xemPhongBanDAO();
	public ArrayList<phongban> getPhongban(){
		return _xemPhongBanDAO.getPhongBan();
	}
	public phongban getPhongBanByIDPB(int idpb) {
		return _xemPhongBanDAO.getPhongBanByID(idpb);
	}
	public void updatePhongBan(int idpb,String tenpb, String mota) {
		_xemPhongBanDAO.updatePhongBan(idpb,tenpb,mota);
	}
}
