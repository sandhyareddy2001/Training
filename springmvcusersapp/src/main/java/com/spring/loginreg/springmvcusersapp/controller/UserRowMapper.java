package com.spring.loginreg.springmvcusersapp.controller;



import java.sql.*;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;



public class UserRowMapper implements RowMapper<Users>{
	
	@Override
	public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Users e = new Users();
		e.setUname(rs.getString(1));
		e.setPswd(rs.getString(2));
		e.setRole(rs.getString(3));
		
		
		
		return e;
	}
	

}
