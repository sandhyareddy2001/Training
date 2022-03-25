package springtry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
		
		/*Address k = (Address)con.getBean("addr");
		System.out.println(k);
		Address m = (Address)con.getBean("a");
		System.out.println(m);
		
		Person pe = (Person)con.getBean("p");
		System.out.println(pe);
		*/
		Country c=(Country) con.getBean("country");
		System.out.println(c);
		Person C=(Person) con.getBean("p");
		System.out.println(C);
		
		
		AnnotationConfigApplicationContext op= new AnnotationConfigApplicationContext(AnnotationCode.class);
		Address g= (Address) op.getBean("bb");
		System.out.println(g);
	}

}
