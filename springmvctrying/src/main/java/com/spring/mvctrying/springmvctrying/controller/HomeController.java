package com.spring.mvctrying.springmvctrying.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvctrying.springmvctrying.model.Employees;


@Controller
public class HomeController {
	
	@Autowired
	JdbcTemplate template;

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/login")
	public ModelAndView test1(HttpServletResponse response) throws IOException{
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="/validate")
	public ModelAndView validate(HttpServletResponse response, HttpServletRequest request) throws IOException{
		
		
		boolean isFound= false;
		String uname = request.getParameter("uname");
		String passwd = request.getParameter("pswd");
		
		String sql="select * from employee";
		List<Employees>eu= template.query(sql, new EmpRowMapper());
		
		for (Employees u : eu) {
			if (uname.equals(u.getFirstName()) && passwd.equals(u.getLastName())) {
				isFound = true;
				break;
			}
		}
		if (isFound)
			return new ModelAndView("success");
		else
			return new ModelAndView("fail");
		
	
		
	
		
	}
}
