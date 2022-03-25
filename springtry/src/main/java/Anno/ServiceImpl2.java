package Anno;

import org.springframework.stereotype.Component;

@Component("Free")
public class ServiceImpl2 implements ServiceInterface{

	@Override
	public String whatService() {
		// TODO Auto-generated method stub
		return "This is a free service!  ";
	}
	

}
