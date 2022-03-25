package com.spring.loginreg.springmvcusersapp.controller;



import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class HomeController {
	
	@Autowired
	JdbcTemplate template;
	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("login");
	}
	@RequestMapping(value="/searchByTitle")
	public ModelAndView searchByTitle(HttpServletResponse response) throws IOException{
		return new ModelAndView("searchByTitle");
	}
	

	@RequestMapping(value="/searchTitle")
	public ModelAndView searchTitle(HttpServletResponse response, HttpServletRequest request) throws IOException{
		
		String title = request.getParameter("title");
		
		String sql=" select * from posts where title=?";
		List<Posts> p= template.query(sql,new PostsRowMapper(),title);
		return new ModelAndView("/done","posts",p);
		//return null;
	}
	
	
	@RequestMapping(value="/printStuff")
	public ModelAndView printStuff(HttpServletResponse response, HttpServletRequest request) throws IOException{
		
		String key = request.getParameter("key");
		String tOra = request.getParameter("Keyword");
		List<Posts>p;
		if (tOra.equals("title")) {
			String sql=" select * from posts where title=?";
			p= template.query(sql,new PostsRowMapper(),key);
			return new ModelAndView("okDone","posts",p);
		}
		else if (tOra.equals("author")) {
			String sql=" select * from posts where author=?";
			p= template.query(sql,new PostsRowMapper(),key);
			return new ModelAndView("okDone","posts",p);
			
		}
		else {
			String sql=" select * from posts where description=?";
			p= template.query(sql,new PostsRowMapper(),key);
			return new ModelAndView("okDone","posts",p);
			
		}
		
		//return null;
	}
	
	
	@RequestMapping(value="/delete")
	public ModelAndView delete(HttpServletResponse response) throws IOException{
		return new ModelAndView("/deletePost");
	}
	
	@RequestMapping(value="/deleteTitle")
	public ModelAndView deletePost(HttpServletResponse response, HttpServletRequest request) throws IOException{
		
		String title = request.getParameter("title");
		
		String sql=" delete from posts where title=?";
		template.update(sql,title);
		return null;
		//return null;
	}
	
	
	
	
	
	@RequestMapping(value="/insert")
	public ModelAndView insert(HttpServletResponse response) throws IOException{
		return new ModelAndView("/insertPost");
	}
	
	@RequestMapping(value="/insertPost")
	public ModelAndView insertPost(HttpServletResponse response, HttpServletRequest request) throws IOException{
		
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String description = request.getParameter("description");
		String sql=" insert into posts(title,author,description) values(?,?,?)";
		template.update(sql,title,author,description);
		return null;
		//return null;
	}
	
	
	@RequestMapping(value="/register")
	public ModelAndView register(HttpServletResponse response, HttpServletRequest request) throws IOException{
		
		String uname = request.getParameter("uname");
		String passwd = request.getParameter("pswd");
		String role = request.getParameter("role");
		String sql="insert into users value(?,?,?)";
		template.update(sql,uname,passwd,role);
		return new ModelAndView("login");
		//return null;
	}

	
	
	@RequestMapping(value="/validate")
	public ModelAndView validate(HttpServletResponse response, HttpServletRequest request) throws IOException{

	boolean isFound= false;
	boolean isAdmin= false;
	
	String uname = request.getParameter("uname");
	String passwd = request.getParameter("pswd");
	
	String sql="select * from users";
	List<Users>eu= template.query(sql, new UserRowMapper());
	
	for (Users u : eu) {
		if (uname.equals(u.getUname()) && passwd.equals(u.getPswd())) {
			isFound = true;
			if (u.getRole().equals("admin"))
				isAdmin=true;
			
			break;
		}
	}
	if (isFound) {
		if (isAdmin)
			return new ModelAndView("admin");
		else
			return new ModelAndView("customer");
	}
	else
		return new ModelAndView("register");
	}

	
}
