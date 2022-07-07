package model.bo;

import java.util.ArrayList;

import model.bean.admin;
import model.dao.CheckLoginDAO;
import model.dao.themUserDAO;

public class CheckLoginBO {
	CheckLoginDAO checkLoginDAO = new CheckLoginDAO();
	themUserDAO _themUserDAO = new themUserDAO();
	public boolean isValidUser(String username, String password) {
		return checkLoginDAO.isExistUser(username,password);
	}
//	public ArrayList<Wife> getWifeList(String userName){
//		return checkLoginDAO.getWifeList(userName);
//	}
	public ArrayList<admin> searchUser(String name){
		return _themUserDAO.searchUser(name);
	}
}
