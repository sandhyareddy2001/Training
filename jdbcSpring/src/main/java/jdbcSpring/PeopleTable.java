package jdbcSpring;

public class PeopleTable {
	private int pid;
	String name;
	int age;
	String place;
	
	@Override
	public String toString() {
		return "pid=" + pid + ", name=" + name + ", age=" + age + ", place=" + place ;
	}
	PeopleTable(){
		
	}
	public PeopleTable(int pid, String name, int age, String place) {
		super();
		this.pid = pid;
		this.name = name;
		this.age = age;
		this.place = place;
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
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	

}
