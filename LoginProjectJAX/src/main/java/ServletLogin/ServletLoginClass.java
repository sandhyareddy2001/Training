package ServletLogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLoginClass
 */
@WebServlet("/login")
public class ServletLoginClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLoginClass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.println("<html>\r\n"
				+ "    <head>\r\n"
				+ "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n"
				+ "        <title>Login Page</title>\r\n"
				+ "    </head>\r\n"
				+ "    <body>\r\n"
				+ "        <h1>Login Page</h1>\r\n"
				+ "        <p>This is the Login page!</p>\r\n"
				+ "        \r\n"
				+ "        <div align=\"center\">\r\n"
				+ "       <h1>This is the Login page!</h1> \r\n"
				+ "       <form action=\"result\">\r\n"
				+ "  	   	<label for=\"uname\">User name:</label><br>\r\n"
				+ "  		<input type=\"text\" id=\"uname\" name=\"uname\"><br>\r\n"
				+ "  		<label for=\"pswd\">Password :</label><br>\r\n"
				+ "  		<input type=\"text\" id=\"pswd\" name=\"pswd\"><br>\r\n"
				+ "  		<button>Submit</button>\r\n"
				+ "	   </form>\r\n"
				+ "	   </div>\r\n"
				+ "    </body>\r\n"
				+ "</html>\r\n"
				+ "");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}





