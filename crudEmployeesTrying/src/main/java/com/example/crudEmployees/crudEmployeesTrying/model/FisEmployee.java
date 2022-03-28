package com.example.crudEmployees.crudEmployeesTrying.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FisEmployee")
public class FisEmployee {
	@Id
	int id;
	@Column(name="name")
	String name;
	@Column(name="role")
	String role;
	@Column(name="dept")
	String dept;
	public FisEmployee() {}
	public FisEmployee(int id, String name, String role, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

}
