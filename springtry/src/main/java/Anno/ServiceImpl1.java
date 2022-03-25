package Anno;

import org.springframework.stereotype.Component;

@Component("Paid")
public class ServiceImpl1 implements ServiceInterface{

	@Override
	
	public String whatService() {
		// TODO Auto-generated method stub
		return "This is a paid service!! ";
	}
	

}
