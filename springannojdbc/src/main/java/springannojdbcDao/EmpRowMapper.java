package springannojdbcDao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import Model.Employee;

public class EmpRowMapper implements RowMapper<Employee>{

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Employee e = new Employee();
		e.setId(rs.getInt(1));
		e.setFname(rs.getString(2));
		e.setLname(rs.getString(3));
		
		
		return e;
	}
	

}
