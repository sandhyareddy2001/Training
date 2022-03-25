

package jdbc;

import java.sql.*;

public class DeleteData {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		// 1. Load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// DriverManager.registerDriver(new com.mysql.jdbc.Driver());

		// 2. Get the connection
		String url = "jdbc:mysql://localhost:3306/db";
		String username = "root";
		String password = "rps@12345";

		Connection con = DriverManager.getConnection(url, username, password);

		// 3. create a statment object
		Statement st = con.createStatement();

		String sql = "delete from employee where id=4;";

		// 4. write the query and excuted, and results are stored
		// in resultset object
		st.executeUpdate(sql);

		
		st.close();
		con.close();

	}

}