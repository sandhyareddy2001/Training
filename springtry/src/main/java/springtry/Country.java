package springtry;

import java.util.*;

public class Country {
	String name;
	List <String> states= new ArrayList();
	
	public Country() {
		
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", states=" + states + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getStates() {
		return states;
	}
	public void setStates(List<String> states) {
		this.states = states;
	}
	public Country(String name, List<String> states) {
		super();
		this.name = name;
		this.states = states;
	}
	
}
