package Anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springtry.AnnotationCode;

public class AnnoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con= new AnnotationConfigApplicationContext(AnnotationConfigg.class);
		
		ConfigServiceImpl1 A= con.getBean(ConfigServiceImpl1.class);
		System.out.println(A.getServiceType());
		
		
		ConfigServiceImpl2 B= con.getBean(ConfigServiceImpl2.class);
		System.out.println(B.getServiceType());

	}

}
