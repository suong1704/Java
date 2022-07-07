package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import Model.BEAN.NhanVienBEAN;


public class NhanVienDAO {
	public ArrayList<NhanVienBEAN> getAllNV(){
		ArrayList<NhanVienBEAN> list = new ArrayList<NhanVienBEAN>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			String url= "jdbc:mysql://localhost:3306/DULIEU1";
			Connection con = DriverManager.getConnection(url,"root","");
			Statement ps = con.createStatement();
			ResultSet rs = ps.executeQuery("select * from nhanvien");
			while(rs.next()) {
				NhanVienBEAN nv = new NhanVienBEAN(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
				list.add(nv);
			}	
		} catch(Exception E) {}
		return list;
	}
	public boolean isValiddDeleteNV(String IDNV) {
		try {
			if(IDNV == "" ) return false;
			Class.forName("com.mysql.cj.jdbc.Driver");  
			String url= "jdbc:mysql://localhost:3306/DULIEU1";
			Connection con = DriverManager.getConnection(url,"root","");
			PreparedStatement ps ;
			String query = "delete from nhanvien where IDNV=?";
			ps = con.prepareStatement(query);
			ps.setString(1,IDNV);
			int rs = ps.executeUpdate();
			if(rs>0){
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public void deleteNV(String IDNV) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			String url= "jdbc:mysql://localhost:3306/DULIEU1";
			Connection con = DriverManager.getConnection(url,"root","");
			PreparedStatement ps ;
			String query = "delete from nhanvien where IDNV=?";
			ps = con.prepareStatement(query);
			ps.setString(1,IDNV);
			ResultSet rs = ps.executeQuery();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	public Boolean isValidAddNV(String IDNV ,String HOTEN,String IDPB,String DIACHI) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			String url= "jdbc:mysql://localhost:3306/DULIEU1";
			Connection con = DriverManager.getConnection(url,"root","");
			PreparedStatement ps ;
			String query = "insert into nhanvien(IDNV,HOTEN,IDPB,DIACHI) values (?,?,?,?)";
			ps = con.prepareStatement(query);
			ps.setString(2,HOTEN);
			ps.setString(3,IDPB);
			ps.setString(4,DIACHI);
			ps.setString(1,IDNV);
			int rs = ps.executeUpdate();
			if(rs>0){
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public ArrayList<NhanVienBEAN> getNVByPB(String IDPB) {
		ArrayList<NhanVienBEAN> list = new ArrayList<NhanVienBEAN>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			String url= "jdbc:mysql://localhost:3306/DULIEU1";
			Connection con = DriverManager.getConnection(url,"root","");
			PreparedStatement ps ;
			String query = "select * from nhanvien where IDPB=?";
			ps = con.prepareStatement(query);
			ps.setString(1,IDPB);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				NhanVienBEAN nv = new NhanVienBEAN(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
				list.add(nv);
			}	
		} catch(Exception E) {}
		return list;
	}
	public ArrayList<NhanVienBEAN> getNVByIDNV(String IDNV) {
		ArrayList<NhanVienBEAN> list = new ArrayList<NhanVienBEAN>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			String url= "jdbc:mysql://localhost:3306/DULIEU1";
			Connection con = DriverManager.getConnection(url,"root","");
			PreparedStatement ps ;
			String query = "select * from nhanvien where IDNV=?";
			ps = con.prepareStatement(query);
			ps.setString(1,IDNV);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				NhanVienBEAN nv = new NhanVienBEAN(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
				list.add(nv);
			}	
		} catch(Exception E) {}
		return list;
	}
	public ArrayList<NhanVienBEAN> getNVByHoten(String HOTEN) {
		ArrayList<NhanVienBEAN> list = new ArrayList<NhanVienBEAN>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			String url= "jdbc:mysql://localhost:3306/DULIEU1";
			Connection con = DriverManager.getConnection(url,"root","");
			PreparedStatement ps ;
			String query = "select * from nhanvien where HOTEN=?";
			ps = con.prepareStatement(query);
			ps.setString(1,HOTEN);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				NhanVienBEAN nv = new NhanVienBEAN(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
				list.add(nv);
			}	
		} catch(Exception E) {}
		return list;
	}
	public ArrayList<NhanVienBEAN> getNVByDC(String DIACHI) {
		ArrayList<NhanVienBEAN> list = new ArrayList<NhanVienBEAN>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			String url= "jdbc:mysql://localhost:3306/DULIEU1";
			Connection con = DriverManager.getConnection(url,"root","");
			PreparedStatement ps ;
			String query = "select * from nhanvien where DIACHI=?";
			ps = con.prepareStatement(query);
			ps.setString(1,DIACHI);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				NhanVienBEAN nv = new NhanVienBEAN(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
				list.add(nv);
			}	
		} catch(Exception E) {}
		return list;
	}
	
}
