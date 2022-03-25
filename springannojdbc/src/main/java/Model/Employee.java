package Model;

import java.security.PublicKey;

public class Employee {
	int id;
	String fname;
	String lname;
	
	public Employee(){
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}
	public Employee(int id, String fname, String lname) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}
	private int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	private String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	

}
