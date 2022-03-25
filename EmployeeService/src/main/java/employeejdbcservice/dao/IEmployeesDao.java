package employeejdbcservice.dao;

import java.sql.SQLException;
import java.util.List;

import employeejdbcservice.model.Employees;

public interface IEmployeesDao {
	public List <Employees> getAllEmployees() throws ClassNotFoundException, SQLException;
	public String insertEmployees(Employees employee)throws ClassNotFoundException, SQLException;
	public String deleteEmployee(int id) throws ClassNotFoundException, SQLException;


}
