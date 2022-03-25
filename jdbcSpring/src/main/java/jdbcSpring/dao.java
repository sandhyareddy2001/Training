package jdbcSpring;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class dao {
	JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
		
	}
	
	public void setTemplate(JdbcTemplate Template) {
		this.template=Template;
		
	}
	
	public String insertData(PeopleTable person) {
		String sql="insert into persons value(?,?,?,?)";
		template.update(sql,person.getPid(),person.getName(),person.getAge(),person.getPlace() );
		return "Data inserted ";
		
	}
	public String deletetData(int id) {
		String sql="delete from persons where pid=?";
		template.update(sql,id );
		return "Row Deleted ";
		
	}
	public List<PeopleTable> getAll(){
		String sql="select * from persons";
		return template.query(sql, new PeopleRowMapper());
	}
	
	public List<PeopleTable> getPersonByID(int id){
		String sql="select * from persons where pid=?";
		
		
		return template.query(sql,new PeopleRowMapper(),id);
	}

}
