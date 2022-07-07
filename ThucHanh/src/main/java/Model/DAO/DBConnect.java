package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnect {
	private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    protected void hasDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("Invalid Driver!! Please check this driver...");
        }
    }
    protected Connection openConnect() {
        try {
            if (conn == null) {
                hasDriver();
                String url = "jdbc:mysql://localhost/dulieu1";
                conn = DriverManager.getConnection(url, "root", " ");
            }
        } catch (Exception e) {
            System.out.println("Error Connecton! Please check url or username and password of mysql!");
        }
        return conn;
    }

    protected Statement getStatement() {
        try {
            if (stmt == null) {
                stmt = openConnect().createStatement();
            }
        } catch (Exception e) {
            System.out.println("Please check statement");
        }
        return stmt;
    }

    protected void closeConnect() {
        try {
            if (conn != null) {
                conn.close();
            }
            if (rs != null & !rs.isClosed()) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
        } catch (Exception e) {
            System.out.println("Please check close connect, stmt, resutlset");
        }

    }

}
