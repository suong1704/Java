package model.bo;

import java.util.ArrayList;


import model.dao.CheckLoginDAO;


public class CheckLoginBO {
	CheckLoginDAO checkLoginDAO = new CheckLoginDAO();

	public boolean isValidUser(String username, String password) {
		return checkLoginDAO.isExistUser(username,password);
	}

}
