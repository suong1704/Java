package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;




public class CheckLoginDAO {
	 private Connection connect = null;
	 private Statement statement = null;
	 private PreparedStatement preparedStatement = null;
	 private ResultSet rs = null;
	 private DBConect DBconnect = null;
	 public CheckLoginDAO() {
	        DBconnect = new DBConect();
	    }
	public boolean isExistUser(String username , String password) throws SQLException {
		
		String sql= "Select * from user where username =? and password =?";
		preparedStatement = DBconnect.openConnect().prepareStatement(sql);
		preparedStatement.setString(1, username);
		preparedStatement.setString(2, password);
		rs = preparedStatement.executeQuery();
		if(rs.next()) {
			return true;
		}
		else return false;
	}
	
	public ArrayList<Wife> getListWife(String username) throws SQLException {
		ArrayList<Wife> listwife = null;
		String sql= "Select * from user where username =?";
		preparedStatement = DBconnect.openConnect().prepareStatement(sql);
		preparedStatement.setString(1, username);
		rs = preparedStatement.executeQuery();
		while (rs.next()) {
				Wife wife = null;
				wife = new Wife(rs.getString("name"), rs.getString("address"), rs.getBoolean("alive"));
				listwife.add(wife);
		}
		return listwife;
	}
}
