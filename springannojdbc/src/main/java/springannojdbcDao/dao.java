package springannojdbcDao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import Model.Employee;

public class dao {
	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public List<Employee> getAll(){
		String sql="select * from employee";
		return template.query(sql, new EmpRowMapper());
		
	}

}
