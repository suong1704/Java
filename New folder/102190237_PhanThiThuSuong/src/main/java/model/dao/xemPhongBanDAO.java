package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.nhanvien;
import model.bean.phongban;

public class xemPhongBanDAO {
	public ArrayList<phongban> getPhongBan(){
		ArrayList<phongban> result = new ArrayList<phongban>();
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");  
			//System.out.println("Pass1");
			String url= "jdbc:mysql://localhost/dulieu";
			Connection con = DriverManager.getConnection(url,"root","");
			//System.out.println("Pass2");
			Statement ps = con.createStatement();
		
			ResultSet rs = ps.executeQuery("select * from phongban");
			while(rs.next()) {
				phongban pb = new phongban();
				pb.setIDPB(rs.getInt(1));
				pb.setTENPB(rs.getString(2));
				pb.setMOTA(rs.getString(3));
				result.add(pb);
			}	
	
		} catch(Exception E) {}
	return result;
	}
	
	public phongban getPhongBanByID(int idpb) {
		phongban pb = new phongban();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			String url= "jdbc:mysql://localhost/dulieu";
			Connection con = DriverManager.getConnection(url,"root","");
			
			PreparedStatement ps;
			String sql = "select * from phongban where IDPB=?";
			
			ps = con.prepareStatement(sql);
			ps.setInt(1,idpb);

			ResultSet rs = ps.executeQuery();
		
			while(rs.next()) {
				if(rs.getInt(1) == idpb) {
					pb.setIDPB(rs.getInt(1));
					pb.setTENPB(rs.getString(2));
					pb.setMOTA(rs.getString(3));
		
				}
				
			}	
		} catch(Exception e) {}
		return pb;
	}
	public void updatePhongBan(int idpb,String tenpb, String mota) {
		try {
			System.out.println("DA vao trong update phong ban");

			Class.forName("com.mysql.cj.jdbc.Driver");  
			String url= "jdbc:mysql://localhost/dulieu";
			Connection con = DriverManager.getConnection(url,"root","");
			PreparedStatement ps;
			String sql = "update phongban set IDPB = ? , TENPB = ?, MOTA = ? where IDPB = ?";
			
			ps = con.prepareStatement(sql);
			ps.setInt(1,idpb);
			ps.setString(2,tenpb);
			ps.setString(3,mota);
			ps.setInt(4,idpb);
			ps.executeUpdate();
		} catch(Exception E) {}

	}
	
}