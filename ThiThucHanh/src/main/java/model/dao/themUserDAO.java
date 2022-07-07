package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.admin;


public class themUserDAO {
	public void themUser(String username, String password, String firstname, String lastname) {
		ArrayList<admin> result = new ArrayList<admin>();
		try {
			System.out.println("DA vao trong them admin");

			Class.forName("com.mysql.cj.jdbc.Driver");  
			System.out.println("Pass1");
			String url= "jdbc:mysql://localhost/test888";
			Connection con = DriverManager.getConnection(url,"root","");
			System.out.println("Pass2");
			PreparedStatement ps;
			String sql = "insert into tableuser(username,password,firstname,lastname,roles) values (?,?,?,?,?)";
			int a = 2;
			ps = con.prepareStatement(sql);
			ps.setString(1,username);
			ps.setString(2,password);
			ps.setString(3,firstname);
			ps.setString(4,lastname);
			ps.setInt(5,a);
			ps.executeUpdate();
		

		System.out.println("da them thanh cong");
	
		} catch(Exception E) {}

	}
	public ArrayList<admin> searchUser(String name){
		ArrayList<admin> result = new ArrayList<admin>();
		try {
			System.out.println("DA vao trong search");

			Class.forName("com.mysql.cj.jdbc.Driver");  
			//System.out.println("Pass1");
			String url= "jdbc:mysql://localhost/test888";
			Connection con = DriverManager.getConnection(url,"root","");
			//System.out.println("Pass2");
			PreparedStatement ps;
			String sql = "select * from tableuser where firstname = ? or lastname = ?";
			
			ps = con.prepareStatement(sql);
			ps.setString(1,name);
			ps.setString(2,name);

			
		
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				admin nv = new admin();
				nv.setUsername(rs.getString(1));
				nv.setPassword(rs.getString(2));
				nv.setFirstName(rs.getString(3));
				nv.setLastName(rs.getString(4));
				nv.setRoles(rs.getInt(5));
				
				result.add(nv);
			}	
	
		} catch(Exception E) {}
	return result;
	}
	
	public void deleteUser(String username) {
		try {
			System.out.println("DA vao trong delete nhan vien");

			Class.forName("com.mysql.cj.jdbc.Driver");  
			//System.out.println("Pass1");
			String url= "jdbc:mysql://localhost/test888";
			Connection con = DriverManager.getConnection(url,"root","");
			//System.out.println("Pass2");
			PreparedStatement ps;
			String sql = "delete from tableuser where username = ?";
			
			ps = con.prepareStatement(sql);
			ps.setString(1,username);
	
			ps.executeUpdate();
		

		System.out.println("da delete user thanh cong");
	
		} catch(Exception E) {}

	
	}
}
