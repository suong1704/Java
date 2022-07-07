package Model;

import java.sql.SQLException;
import java.util.ArrayList;

public class CheckLoginBO {
	CheckLoginDAO checkLoginDAO = new CheckLoginDAO();
	
	public boolean isValidUser(String username, String password) throws SQLException  {
		return checkLoginDAO.isExistUser(username, password);
	}
	public ArrayList<Wife> getWifeList(String username) throws SQLException {
			return checkLoginDAO.getListWife(username);

	}
}
