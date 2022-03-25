package jdbcSpring;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c= new ClassPathXmlApplicationContext("beans.xml");
		dao d= (dao) c.getBean("dao");
		
		System.out.println("Pid: ");
		Scanner sc= new Scanner(System.in);
		int id=sc.nextInt();
		/*
		System.out.println("Name: ");
		String name= sc.next();
		System.out.println("Age: ");
		int age= sc.nextInt();
		System.out.println("Place: ");
		String place=sc.next();
		*/
		List<PeopleTable> persons = d.getPersonByID(id);
		persons.forEach(System.out::println);
		/*
		PeopleTable p =new PeopleTable(2,"Lavanya",27,"Karnataka");
		PeopleTable p1 =new PeopleTable(3,"Pavan",55,"West Bengal");
		PeopleTable p2 =new PeopleTable(4,"Vaishnav",33,"Kerala");
		PeopleTable p3 =new PeopleTable(5,"Ranjana",59,"Punjab");
		PeopleTable p4 =new PeopleTable(6,"Faruk",18,"Punjab");
		PeopleTable p5 =new PeopleTable(7,"Sandeep",42,"Telangana");
		PeopleTable p6 =new PeopleTable(8,"Sanjana",39,"Andhra Pradesh");
		System.out.println(d.insertData(p));
		System.out.println(d.insertData(p1));
		System.out.println(d.insertData(p2));
		System.out.println(d.insertData(p3));
		System.out.println(d.insertData(p4));
		System.out.println(d.insertData(p5));
		System.out.println(d.insertData(p6));
		*/
		
		
		
	}

}
