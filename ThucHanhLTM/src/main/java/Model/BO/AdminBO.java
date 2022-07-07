package Model.BO;

import java.util.ArrayList;

import Model.BEAN.admin;
import Model.DAO.AdminDAO;

public class AdminBO {
	public void themAdmin(String username, String password, String firstname, String lastname, String roles) {
		AdminDAO adminDAO = new AdminDAO();
		adminDAO.themAdmin(username,password,firstname,lastname,roles);
	}
	public ArrayList<admin> searchAdmin(String lastname){
		AdminDAO adminDAO = new AdminDAO();
		return adminDAO.searchAdmin(lastname);
		
	}
	public admin searchAdminByUsername(String username){
		AdminDAO adminDAO = new AdminDAO();
		return adminDAO.searchAdminByUsername(username);
		
	}
	public boolean isValidSearhAdmin(String lastname){
		AdminDAO adminDAO = new AdminDAO();
		return adminDAO.isValidSearchAdmin(lastname);
		
	}
	public boolean isValidDeleteAdmin(String lastname){
		AdminDAO adminDAO = new AdminDAO();
		return adminDAO.isValidDeleteAdmin(lastname);
		
	}
	public boolean isValidUpdateAdmin(String username,String roles,String lastname){
		AdminDAO adminDAO = new AdminDAO();
		return adminDAO.isValidUpdateAdmin(username,roles,lastname);
		
	}
	
	
}
