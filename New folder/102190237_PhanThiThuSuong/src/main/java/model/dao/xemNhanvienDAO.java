package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.nhanvien;


public class xemNhanvienDAO {
	public ArrayList<nhanvien> getNhanVien(){
		ArrayList<nhanvien> result = new ArrayList<nhanvien>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			String url= "jdbc:mysql://localhost/dulieu";
			Connection con = DriverManager.getConnection(url,"root","");
			Statement ps = con.createStatement();
		
			ResultSet rs = ps.executeQuery("select * from nhanvien");
			while(rs.next()) {
				nhanvien nv = new nhanvien();
				nv.setIDNV(rs.getInt(1));
				nv.setName(rs.getString(2));
				nv.setIDPB(rs.getInt(3));
				nv.setDIACHI(rs.getString(4));
				result.add(nv);
			}	
	
		} catch(Exception E) {}
	return result;
	}
	public void themNhanVien(int IDNV, String HOTEN, int IDPB, String DIACHI){
		ArrayList<nhanvien> result = new ArrayList<nhanvien>();
		try {
			System.out.println("DA vao trong them nhan vien");

			Class.forName("com.mysql.cj.jdbc.Driver");  
			//System.out.println("Pass1");
			String url= "jdbc:mysql://localhost/dulieu";
			Connection con = DriverManager.getConnection(url,"root","");
			//System.out.println("Pass2");
			PreparedStatement ps;
			String sql = "insert into nhanvien(IDNV,HOTEN,IDPB,DIACHI) values (?,?,?,?)";
			
			ps = con.prepareStatement(sql);
			ps.setInt(1,IDNV);
			ps.setString(2,HOTEN);
			ps.setInt(3,IDPB);
			ps.setString(4,DIACHI);
			ps.executeUpdate();
		

		System.out.println("da them thanh cong");
	
		} catch(Exception E) {}

	}
	
	public ArrayList<nhanvien> getNhanVienByIDPB(int IDPB){
		ArrayList<nhanvien> result = new ArrayList<nhanvien>();
		try {
			//System.out.println("DA vao trong xemnhanvien");

			Class.forName("com.mysql.cj.jdbc.Driver");  
			//System.out.println("Pass1");
			String url= "jdbc:mysql://localhost/dulieu";
			Connection con = DriverManager.getConnection(url,"root","");
			//System.out.println("Pass2");
			PreparedStatement ps;
			String sql = "select * from nhanvien where IDPB=?";
			
			ps = con.prepareStatement(sql);
			ps.setInt(1,IDPB);

			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				nhanvien nv = new nhanvien();
				nv.setIDNV(rs.getInt(1));
				nv.setName(rs.getString(2));
				nv.setIDPB(rs.getInt(3));
				nv.setDIACHI(rs.getString(4));
				result.add(nv);
			}	
	
		} catch(Exception E) {}
	return result;
	}
	
	public void deleteNhanVien(int idnv) {
		try {
			System.out.println("DA vao trong delete nhan vien");

			Class.forName("com.mysql.cj.jdbc.Driver");  
			//System.out.println("Pass1");
			String url= "jdbc:mysql://localhost/dulieu";
			Connection con = DriverManager.getConnection(url,"root","");
			//System.out.println("Pass2");
			PreparedStatement ps;
			String sql = "delete from nhanvien where IDNV = ?";
			
			ps = con.prepareStatement(sql);
			ps.setInt(1,idnv);
	
			ps.executeUpdate();
		

		System.out.println("da delete nhan vien thanh cong");
	
		} catch(Exception E) {}

	}
	public ArrayList<nhanvien> searchNhanVien(String search, String name){
		ArrayList<nhanvien> result = new ArrayList<nhanvien>();
		try {
			//System.out.println("DA vao trong Search nhanvien");

			Class.forName("com.mysql.cj.jdbc.Driver");  
			//System.out.println("Pass1");
			String url= "jdbc:mysql://localhost/dulieu";
			Connection con = DriverManager.getConnection(url,"root","");
			//System.out.println("Pass connect to database");
			
			
			if(search.equals("HOTEN")) {
				PreparedStatement ps;
				String sql = "select * from nhanvien where HOTEN=?";
				
				ps = con.prepareStatement(sql);
				ps.setString(1,name);

				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					nhanvien nv = new nhanvien();
					nv.setIDNV(rs.getInt(1));
					nv.setName(rs.getString(2));
					nv.setIDPB(rs.getInt(3));
					nv.setDIACHI(rs.getString(4));
					result.add(nv);
				}	
			}
			else if(search.equals("IDNV")) {
				PreparedStatement ps;
				String sql = "select * from nhanvien where IDNV=?";
				int idnv = Integer.parseInt(name);
				
				ps = con.prepareStatement(sql);
				ps.setInt(1,idnv);

				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					nhanvien nv = new nhanvien();
					nv.setIDNV(rs.getInt(1));
					nv.setName(rs.getString(2));
					nv.setIDPB(rs.getInt(3));
					nv.setDIACHI(rs.getString(4));
					result.add(nv);
				}	
			}
			else if(search.equals("DIACHI")) {
				PreparedStatement ps;
				String sql = "select * from nhanvien where DIACHI=?";
				
				ps = con.prepareStatement(sql);
				ps.setString(1,name);

				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					nhanvien nv = new nhanvien();
					nv.setIDNV(rs.getInt(1));
					nv.setName(rs.getString(2));
					nv.setIDPB(rs.getInt(3));
					nv.setDIACHI(rs.getString(4));
					result.add(nv);
				}	
			}
			
	
		} catch(Exception E) {}
//		for(nhanvien o : result) {
//			System.out.println("test list nhan vien tra ve khi tim kiem");
//			System.out.println(o);
//		}
	return result;
	}
}
