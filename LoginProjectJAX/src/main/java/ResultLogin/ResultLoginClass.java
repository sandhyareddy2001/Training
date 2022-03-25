package ResultLogin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ResultLoginClass
 */
@WebServlet("/result")
public class ResultLoginClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResultLoginClass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
		String u=request.getParameter("uname");
		String p=request.getParameter("pswd");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		// DriverManager.registerDriver(new com.mysql.jdbc.Driver());

		// 2. Get the connection
		String url = "jdbc:mysql://localhost:3306/db";
		String username = "root";
		String password = "rps@12345";

		Connection con = DriverManager.getConnection(url, username, password);

		Statement st = con.createStatement();

		String sql = "select * from employee";

		ResultSet rs = st.executeQuery(sql);
		boolean isFound=false;
		while (rs.next()) {
			if (u.equals(rs.getString(2)) && p.equals(rs.getString(3)==p)) {
				isFound=true;
				break;
			}
	
				
		}	

		rs.close();
		st.close();
		con.close();
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><head><title></title></head><body>");
		if(isFound) {
			out.println("Hi "+u+" !!");
		    out.println("</body></html>");
		}
		else {
			out.println("Not Authorized user!!");
			out.println("</body></html>");
		}
			
		out.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {}
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
