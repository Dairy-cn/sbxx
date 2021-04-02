package main.sbxx.designpattern.servicelocator;

/**
 * @author Dair
 * @since
 */
public class InitalContext {


	public Object lookup(String jndiName){
		if(jndiName.equalsIgnoreCase("service1")){
			return new Service1();
		}else if(jndiName.equalsIgnoreCase("service2")){
			return new Service2();
		}
		return null;
	}
}
