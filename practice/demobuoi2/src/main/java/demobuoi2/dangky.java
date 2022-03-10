package demobuoi2;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import DataAccessLayer.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class dangky
 */
@WebServlet("/dangky")
public class dangky extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceUser su=new ServiceUser();
	
       
    /**
     * @throws SQLException 
     * @see HttpServlet#HttpServlet()
     */
    public dangky() throws SQLException {
        super();
        su.addToList();
       
    }
 private boolean checkEmail(String email) {
	 for(Map.Entry<Object, User> map:ServiceUser.list.entrySet()) {
		 if(email.equals(map.getKey())) {
			 return true;
		 }
	 }
	 return false;
 }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/dangky.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int gt=request.getParameter("gt")=="nam"?0:1;
		String email=request.getParameter("email");
		String passwd=request.getParameter("passwd");
		String sdt=request.getParameter("sdt");
		User u=new User();
		u.setEMAIL(email);
		u.setPASSWORD(passwd);
		u.setGIOITINH(gt);
		u.setSDT(sdt);
	System.out.print(ServiceUser.list.size());
		try {
			if(checkEmail(email)) {
				if(su.UpdateToDataBase(passwd, sdt, gt, email)>0) {
					request.setAttribute("success","Sửa thành công");
				}
			}
			
			else if(su.InserttoDB(u)>0) {
				request.setAttribute("success","Thêm thành công");
				
			}else {
				request.setAttribute("success","Thêm thất bại");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getRequestDispatcher("/dangky.jsp").forward(request, response);
	
	}

}
