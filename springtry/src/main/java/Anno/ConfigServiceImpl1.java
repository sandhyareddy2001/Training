package Anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigServiceImpl1 {
	
	@Autowired
	@Qualifier("Paid")
	ServiceInterface w;
	
	public String getServiceType() {
		return w.whatService();
		
	}
	
	
	

}
