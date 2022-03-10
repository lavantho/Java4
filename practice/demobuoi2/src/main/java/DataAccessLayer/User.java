package DataAccessLayer;

public class User {
private int ID;
private String EMAIL;
private String PASSWORD;
private String SDT;
private int GIOITINH;
public User() {
	// TODO Auto-generated constructor stub
}
public User(int iD, String eMAIL, String pASSWORD, int gIOITINH,String sDT) {
	super();
	ID = iD;
	EMAIL = eMAIL;
	PASSWORD = pASSWORD;
	GIOITINH = gIOITINH;
	SDT=sDT;
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getEMAIL() {
	return EMAIL;
}
public void setEMAIL(String eMAIL) {
	EMAIL = eMAIL;
}
public String getPASSWORD() {
	return PASSWORD;
}
public void setPASSWORD(String pASSWORD) {
	PASSWORD = pASSWORD;
}
public int getGIOITINH() {
	return GIOITINH;
}
public void setGIOITINH(int gIOITINH) {
	GIOITINH = gIOITINH;
}
public String getSDT() {
	return SDT;
}
public void setSDT(String sDT) {
	SDT = sDT;
}

}
