package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.BEAN.admin;
import Model.BEAN.sinhvien;

public class SinhVienDAO {
	public ArrayList<sinhvien> searchSinhVien(String khoa) {
		ArrayList<sinhvien> result = new ArrayList<sinhvien>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			String url= "jdbc:mysql://localhost:3306/test888";
			Connection con = DriverManager.getConnection(url,"root","");
			PreparedStatement ps ;
			String query = "select * from sinhvien where khoa=?";
			ps = con.prepareStatement(query);
			ps.setString(1,khoa);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				sinhvien sv = new sinhvien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
				result.add(sv);
				System.out.print("1: "+rs.getString(1));
			}
	}
		catch (Exception e) {
			// TODO: handle exception
		}
		return result;
		
	}
	public boolean isValidSearchSV(String khoa) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			String url= "jdbc:mysql://localhost:3306/test888";
			Connection con = DriverManager.getConnection(url,"root","");
			PreparedStatement ps ;
			String query = "select * from sinhvien where khoa=?";
			ps = con.prepareStatement(query);
			ps.setString(1,khoa);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean isValidDeleteSinhVien(int maso) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			String url= "jdbc:mysql://localhost:3306/test888";
			Connection con = DriverManager.getConnection(url,"root","");
			PreparedStatement ps ;
			String query = "delete from sinhvien where maso=?";
			ps = con.prepareStatement(query);
			ps.setInt(1,maso);
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
