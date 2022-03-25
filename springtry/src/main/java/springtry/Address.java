package springtry;

public class Address {
	int dno;
	String street;
	String state;
	@Override
	public String toString() {
		return "dno=" + dno + ", street=" + street + ", state=" + state;
	}
	
	public Address() {
		
	}
	public Address(int dno, String street, String state) {
		super();
		this.dno = dno;
		this.street = street;
		this.state = state;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	

}
