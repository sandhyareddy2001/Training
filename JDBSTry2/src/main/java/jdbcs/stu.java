package jdbcs;

import java.sql.*;

public class stu {

	public static void main(String[] args) throws SQLException,ClassNotFoundException  {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		//DriverManager.registrer(hb);
		
		String url= "jdbc:mysql://localhost:3306/db";
		String username="root";
		String password ="rps@12345";
		Connection con= DriverManager.getConnection(url,username,password);
		
		Statement st=con.createStatement();
		
		String sql="select * from employee";
		
		ResultSet rs= st.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		
		rs.close();
		st.close();
		con.close();
		

	}

}
