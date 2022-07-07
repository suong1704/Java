package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;



public class CheckLoginDAO {
	public boolean isExistUser(String username, String password) {
		try {
	
			System.out.println("test1");
			Class.forName("com.mysql.cj.jdbc.Driver");  
			System.out.println("Pass1");
			String url= "jdbc:mysql://localhost/test888";
			Connection con = DriverManager.getConnection(url,"root","");
			System.out.println("Pass2");
	
			
			Statement st = con.createStatement();
			String query = "select * from tableuser where username = ? and password = ?";
			PreparedStatement ps;
			ps = con.prepareStatement(query);
			ps.setString(1,username);
			ps.setString(2,password);
			ResultSet rs = ps.executeQuery();
			System.out.println("da query");
			System.out.println(username);
			System.out.println(password);
			if(rs.next()){
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
//	public ArrayList<Wife> getWifeList(String userName){
//		ArrayList<Wife> result = new ArrayList<Wife>();
//		//connect vao DB de lam viec
/
//		
//		return result;
//	}
}
