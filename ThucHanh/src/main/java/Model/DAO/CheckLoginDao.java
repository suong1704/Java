package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CheckLoginDao {
	public boolean isExistUser(String username, String password) {
		try {
	
			Class.forName("com.mysql.cj.jdbc.Driver");  
			String url= "jdbc:mysql://localhost/dulieu1";
			Connection con = DriverManager.getConnection(url,"root","");
			
			//Statement st = con.createStatement();
			String query = "select * from admin where username = ? and password = ?";
			PreparedStatement ps;
			ps = con.prepareStatement(query);
			ps.setString(1,username);
			ps.setString(2,password);
			ResultSet rs = ps.executeQuery();
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
}
