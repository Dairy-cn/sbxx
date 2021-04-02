package main.sbxx.designpattern.servicelocator;

/**
 * @author Dair
 * @since
 */
public class Test {
	
	public static void main(String[] args) {
		Service service1 = ServiceLocator.getService("service1");
		service1.execute();
		service1 = ServiceLocator.getService("service2");
		service1.execute();
		
		service1 = ServiceLocator.getService("service1");
		service1.execute();
		service1 = ServiceLocator.getService("service2");
		service1.execute();
	}
}
