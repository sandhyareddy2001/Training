package com.jerseyEmployee.project.EmployeeProj;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	int id;
	String name;
	String department;
	public Employee() {}
	public Employee(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	@Override
	public String toString() {
		return id + " " + name + " " + department + "\n";
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	

}
