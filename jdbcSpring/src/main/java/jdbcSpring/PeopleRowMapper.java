package jdbcSpring;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PeopleRowMapper implements RowMapper<PeopleTable>{

	public PeopleTable mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		PeopleTable p =new PeopleTable();
		p.setPid(rs.getInt(1));
		p.setName(rs.getString(2));
		p.setAge(rs.getInt(3));
		p.setPlace(rs.getString(4));
		
		
		return p;
	}

	
}
	


