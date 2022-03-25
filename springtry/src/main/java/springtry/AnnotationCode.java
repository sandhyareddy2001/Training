package springtry;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationCode {
	
	@Bean(name="bb")
	public Address returnAddr() {
		
		
		return new Address(1,"gfds","gfds");
		
	}
	
	

}
