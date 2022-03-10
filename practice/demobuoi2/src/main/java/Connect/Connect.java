package Connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	public static Connection con;
	public static final String DB_URL="jdbc:mysql://localhost:3306/buoi1";
	public static final String USER_NAME="root";
	public static final String PASS_WORD="";
	

public static Connection getConnection() {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection(DB_URL,USER_NAME,PASS_WORD);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return con;
}
}
