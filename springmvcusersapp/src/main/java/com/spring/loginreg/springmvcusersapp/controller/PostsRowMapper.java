package com.spring.loginreg.springmvcusersapp.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class PostsRowMapper implements RowMapper<Posts> {
	
	@Override
	public Posts mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Posts e = new Posts();
		e.setPid(rs.getInt(1));
		e.setName(rs.getString(2));
		e.setAuthor(rs.getString(3));
		e.setDescription(rs.getString(4));
		
		return e;
	}
}
