package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Model.BEAN.NhanVienBEAN;
import Model.BEAN.PhongBanBEAN;

public class PhongBanDAO {
	public ArrayList<PhongBanBEAN> getAllPB() {
			ArrayList<PhongBanBEAN> list = new ArrayList<PhongBanBEAN>();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");  
				String url= "jdbc:mysql://localhost:3306/DULIEU1";
				Connection con = DriverManager.getConnection(url,"root","");
				Statement ps = con.createStatement();
				ResultSet rs = ps.executeQuery("select * from phongban");
				while(rs.next()) {
					PhongBanBEAN pb = new PhongBanBEAN(rs.getString(1),rs.getString(2),rs.getString(3));
					list.add(pb);
				}	
			} catch(Exception E) {}
			return list;
		
	}
}
