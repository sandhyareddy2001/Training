package springtry;

public class Person {
	
	String name;
	Address adr;
	@Override
	public String toString() {
		return "name=" + name + ", adr=" + adr;
	}
	public Person(String name, Address adr) {
		super();
		this.name = name;
		this.adr = adr;
	}
	public Person() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdr() {
		return adr;
	}
	public void setAdr(Address adr) {
		this.adr = adr;
	}
	

}
