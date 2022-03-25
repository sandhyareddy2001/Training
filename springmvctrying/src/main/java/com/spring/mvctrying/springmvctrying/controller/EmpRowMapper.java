package com.spring.mvctrying.springmvctrying.controller;



import java.sql.*;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.mvctrying.springmvctrying.model.Employees;


public class EmpRowMapper implements RowMapper<Employees>{
	
	@Override
	public Employees mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Employees e = new Employees();
		e.setId(rs.getInt(1));
		e.setFirstName(rs.getString(2));
		e.setLastName(rs.getString(3));
		
		
		return e;
	}
	

}
