package employeejdbcservice.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import employeejdbcservice.model.Employees;

public class EmployeesDaoImpl implements IEmployeesDao{
	public String deleteEmployee(int id) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/db";
		String username = "root";
		String password = "rps@12345";// 

		Connection con = DriverManager.getConnection(url, username, password);
		String sql = "delete from employee where id=?";
		
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, id);
		pst.executeUpdate();
		pst.close();
		con.close();

		return "Row with id "+id+" deleted..";
		
	}

	public List<Employees> getAllEmployees() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				List<Employees> data = new ArrayList();
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

				while (rs.next()) {
					Employees emp = new Employees(rs.getInt(1),rs.getString(2),rs.getString(3)); 
					data.add(emp);
				}	

				rs.close();
				st.close();
				con.close();
				return data;
			}
	

	public String insertEmployees(Employees employee) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		List<Employees> data = new ArrayList();
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/db";
		String username = "root";
		String password = "rps@12345";// 

		Connection con = DriverManager.getConnection(url, username, password);
		String sql = "insert into employee values (?,?,?)";
		
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, employee.getId());
		pst.setString(2, employee.getFirstName());
		pst.setString(3, employee.getLastName());
		pst.executeUpdate();

		pst.close();
		con.close();
		return "Record Inserted";
	}
	}


