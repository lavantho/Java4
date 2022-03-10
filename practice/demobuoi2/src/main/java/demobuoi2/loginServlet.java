package demobuoi2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Connect.Connect;
import DataAccessLayer.ServiceUser;
import DataAccessLayer.User;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
List<User>list=new ArrayList<>();
ServiceUser sv=new ServiceUser();
  
    public loginServlet() throws SQLException {
        super();
        
   

       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String passwd=request.getParameter("passwd");
	    try {
			list=sv.DangNhap(username, passwd);
			  if(!list.isEmpty()) {
				  request.setAttribute("success", "Đăng nhập thành công");
				  
				 
			    }else {
			    	  request.setAttribute("success", "Đăng nhập thất bại");
			    	  
			    }
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	  
	    
	    request.getRequestDispatcher("/login.jsp").forward(request, response);
	}
	

}
