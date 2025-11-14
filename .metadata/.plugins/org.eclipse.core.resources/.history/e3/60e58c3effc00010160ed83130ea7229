package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection getConnection() throws SQLException {
		String url = "jdbc:h2:~/Dairy";
		String user = "sa";
		String pass = "";
		return DriverManager.getConnection(url, user, pass);
	}

}
