package Model.BO;

import Model.DAO.AdminDAO;

public class AdminBO {
	public boolean isExistUser(String username, String password) {
		AdminDAO adminDAO= new AdminDAO();
		return adminDAO.isExistUser(username, password);
	}
}
