package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import Model.BEAN.VacxinBEAN;

public class VacxinDAO {
	public ArrayList<VacxinBEAN> getAllVacxin() {
		ArrayList<VacxinBEAN> list = new ArrayList<VacxinBEAN>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			String url= "jdbc:mysql://localhost:3306/Test999";
			Connection con = DriverManager.getConnection(url,"root","");
			Statement ps = con.createStatement();
			ResultSet rs = ps.executeQuery("select * from vacxin");
			while(rs.next()) {
				VacxinBEAN nv = new VacxinBEAN(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getInt(5),rs.getString(6));
				list.add(nv);
			}	
		} catch(Exception E) {}
		return list;
	}
	public boolean isValidAddVX(int MaVX ,String TenVX,int SoMui,String MoTa,int GiaVX,String TenHangVX) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			String url= "jdbc:mysql://localhost:3306/Test999";
			Connection con = DriverManager.getConnection(url,"root","");
			PreparedStatement ps ;
			String query = "insert into vacxin (MaVX,TenVX,SoMui,MoTa,GiaVX,TenHangVX) values (?,?,?,?,?,?)";
			ps = con.prepareStatement(query);
			ps.setInt(1,MaVX);
			ps.setString(2,TenVX);
			ps.setInt(3,SoMui);
			ps.setString(4,MoTa);
			ps.setInt(5,GiaVX);
			ps.setString(6,TenHangVX);
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
