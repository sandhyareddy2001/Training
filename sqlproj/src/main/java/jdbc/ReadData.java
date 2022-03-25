
   
package jdbc;

import java.sql.*;

public class ReadData {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		// 1. Load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// DriverManager.registerDriver(new com.mysql.jdbc.Driver());

		// 2. Get the connection
		String url = "jdbc:mysql://localhost:3306/db";
		String username = "root";
		String password = "rps@12345";

		Connection con = DriverManager.getConnection(url, username, password);

		// 3. create a statement object
		Statement st = con.createStatement();

		String sql = "select * from employee";

		// 4. write the query and excuted, and results are stored
		// in resultset object
		ResultSet rs = st.executeQuery(sql);

		while (rs.next())
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));

		rs.close();
		st.close();
		con.close();

	}

}