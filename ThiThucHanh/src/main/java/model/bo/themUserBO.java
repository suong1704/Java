package model.bo;

import model.dao.themUserDAO;


public class themUserBO {
	public void themUser(String username, String password, String firstname, String lastname) {
		themUserDAO _themUserDAO = new themUserDAO();
			_themUserDAO.themUser(username, password, firstname, lastname);
	}
	public void deleteUser(String username) {
		themUserDAO _themUserDAO = new themUserDAO();
		_themUserDAO.deleteUser(username);
	}
}
