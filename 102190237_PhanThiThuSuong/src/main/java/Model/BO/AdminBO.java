package Model.BO;

import Model.DAO.AdminDAO;


public class AdminBO {
	AdminDAO adminDAO = new AdminDAO();
	 public boolean isValidUser(String username, String password) {
			return adminDAO.isExistUser(username,password);
		}
}
