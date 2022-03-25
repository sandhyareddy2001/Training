package employeejdbcservice.service;

import java.sql.SQLException;
import java.util.List;

import employeejdbcservice.dao.EmployeesDaoImpl;
import employeejdbcservice.dao.IEmployeesDao;
import employeejdbcservice.model.Employees;

public class EmployeesServiceImpl implements IEmployeesService{
	IEmployeesDao dao;

	public EmployeesServiceImpl() {
		dao=new EmployeesDaoImpl();
		// TODO Auto-generated constructor stub
	}

	public List<Employees> getAllEmployees() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		return dao.getAllEmployees();
	}

	public String insertEmployees(Employees employee) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return dao.insertEmployees(employee);
	}
	public String deleteEmployee(int id) throws ClassNotFoundException, SQLException{
		return dao.deleteEmployee(id);
	}
	
}
