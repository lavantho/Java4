package DataAccessLayer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



import Connect.Connect;

public class ServiceUser {
public static Map<Object,User> list=new HashMap<>();
public ServiceUser() {
	Connect.getConnection();
 System.out.print(Connect.con);
}

public  void addToList() throws SQLException {
	String query="SELECT*FROM users";
	PreparedStatement pre=Connect.con.prepareStatement(query);
	ResultSet rs=pre.executeQuery();
	while(rs.next()) {
		list.put(rs.getString(2), new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5)));
	}
	
}
public int InserttoDB(User u) throws SQLException {
	String query="INSERT INTO users(EMAIL,PASSWORD,GIOITINH,SDT) VALUES(?,?,?,?)";
	PreparedStatement pre=Connect.con.prepareStatement(query);
	pre.setString(1,u.getEMAIL());
	pre.setString(2,u.getPASSWORD());
	pre.setInt(3,u.getGIOITINH());
	pre.setString(4, u.getSDT());
	return pre.executeUpdate();
}
public int DeleteToDataBase(String email) throws SQLException {
String query="DELETE FROM users WHERE email=?";
PreparedStatement pre=Connect.con.prepareStatement(query);
pre.setString(1, email);
return pre.executeUpdate();
}
public int UpdateToDataBase(String password ,String sdt,int gioitinh,String email) throws SQLException {
	String query="UPDATE users SET PASSWORD=?,SDT=?,GIOITINH=? WHERE EMAIL=?";
	PreparedStatement pre=Connect.con.prepareStatement(query);
	pre.setString(1, password);
	pre.setString(2, sdt);
	pre.setInt(3, gioitinh);
	pre.setString(4, email);
	return pre.executeUpdate();
	
}
public List<User> DangNhap(String email,String password) throws SQLException{
	List<User>login=new ArrayList<>();
	String query="SELECT*FROM users WHERE EMAIL=? AND PASSWORD=?";
	PreparedStatement pre=Connect.con.prepareStatement(query);
	pre.setString(1, email);
	pre.setString(2, password);
	ResultSet rs=pre.executeQuery();
	while(rs.next()) {
		login.add(new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5)));
	}
	return login;
}
}
