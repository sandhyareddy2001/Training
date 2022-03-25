package com.spring.loginreg.springmvcusersapp.controller;

public class Posts {
	int pid;
	String name;
	String author;
	String description;
	public Posts(int pid, String name, String author, String description) {
		super();
		this.pid = pid;
		this.name = name;
		this.author = author;
		this.description = description;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public String getName() {
		return name;
	}
	
	public Posts() {
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Posts(String name, String author, String description) {
		super();
		this.name = name;
		this.author = author;
		this.description = description;
	}
	

}
