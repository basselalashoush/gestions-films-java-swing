package bs.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connections {
	
	private static Connection connection =null;
	private static String connection_string = "jdbc:mysql://localhost:3306/GestionFilmsDB?user=root&password=&serverTimezone=UTC";
	
	public static Connection Instance() {
		 if(connection == null){
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					connection = DriverManager.getConnection(connection_string);
				}catch(Exception e) {
					e.printStackTrace();
				}
		    }
		    return connection;
	}
}
