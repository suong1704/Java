package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Model.BEAN.admin;



public class AdminDAO {
	public void themAdmin(String username, String password, String firstname, String lastname, String roles) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			String url= "jdbc:mysql://localhost:3306/test888";
			Connection con = DriverManager.getConnection(url,"root","");
			PreparedStatement ps ;
			String query = "insert into admin (username,password,firstname,lastname,roles) values (?,?,?,?,?)";
			ps = con.prepareStatement(query);
			ps.setString(1,username);
			ps.setString(2,password);
			ps.setString(3,firstname);
			ps.setString(4,lastname);
			ps.setString(5,roles);
			ps.executeUpdate();
//			if(rs.next()){
//				return true;
//			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
//		return false;
	}
	public ArrayList<admin> searchAdmin(String lastname) {
		ArrayList<admin> result = new ArrayList<admin>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			String url= "jdbc:mysql://localhost:3306/test888";
			Connection con = DriverManager.getConnection(url,"root","");
			PreparedStatement ps ;
			String query = "select * from admin where lastname=?";
			ps = con.prepareStatement(query);
			ps.setString(1,lastname);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				admin ad = new admin(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				result.add(ad);
				System.out.print("1: "+rs.getString(1));
			}
	}
		catch (Exception e) {
			// TODO: handle exception
		}
		return result;
		
}
	public admin searchAdminByUsername(String username) {
		admin result =null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			String url= "jdbc:mysql://localhost:3306/test888";
			Connection con = DriverManager.getConnection(url,"root","");
			PreparedStatement ps ;
			String query = "select * from admin where username=?";
			ps = con.prepareStatement(query);
			ps.setString(1,username);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				result = new admin(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				System.out.print(rs.getString(2));
			}
	}
		catch (Exception e) {
			// TODO: handle exception
		}
		return result;
		
}

	public boolean isValidSearchAdmin(String lastname) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			String url= "jdbc:mysql://localhost:3306/test888";
			Connection con = DriverManager.getConnection(url,"root","");
			PreparedStatement ps ;
			String query = "select * from admin where lastname=?";
			ps = con.prepareStatement(query);
			ps.setString(1,lastname);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}
	public boolean isValidUpdateAdmin(String username,String roles,String lastname) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			String url= "jdbc:mysql://localhost:3306/test888";
			Connection con = DriverManager.getConnection(url,"root","");
			PreparedStatement ps ;
			String query = "update admin set roles=?,lastname=? WHERE  username=?;";
			ps = con.prepareStatement(query);
			ps.setString(1,roles);
			ps.setString(2,lastname);
			ps.setString(3,username);
			int rs = ps.executeUpdate();
			if(rs>0){
				return true;
			}
			
		} catch (Exception e) {
			System.out.print("message: "+e.getMessage());
		}
		return false;
}
	public boolean isValidDeleteAdmin(String username) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			String url= "jdbc:mysql://localhost:3306/test888";
			Connection con = DriverManager.getConnection(url,"root","");
			PreparedStatement ps ;
			String query = "delete from admin where username=?";
			ps = con.prepareStatement(query);
			ps.setString(1,username);
			int rs = ps.executeUpdate();
			if(rs>0){
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}
	
}
