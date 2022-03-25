package com.spring.loginreg.springmvcusersapp.controller;


public class Users {
	String uname;
	String pswd;
	String role;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Users(String uname, String pswd, String role) {
		super();
		this.uname = uname;
		this.pswd = pswd;
		this.role = role;
	}
	public Users() {
		
	}
	
	

}
