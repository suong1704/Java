package demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class CDSLdemo {
	public static void main(String[] args) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("Pass1");
			String url = "jdbc:sqlserver://LAPTOP-SP3141DR\\MSSQLSERVER08:1433;databaseName=QuanLySach;integratedSecurity=true";
			Connection connection = DriverManager.getConnection(url , "sa" , "107201");
			System.out.println("Pass2");
			
		} catch (Exception e) {
			System.out.print("Loi "+e.getMessage() );
		}
	}
}
//Server=localhost\MSSQLSERVER10;Database=master;Trusted_Connection=True;