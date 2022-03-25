package Anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConfigServiceImpl2 {
	
	@Autowired
	@Qualifier("Free")
	ServiceInterface r;
	
	public String getServiceType() {
		return r.whatService();
		
	}

}
