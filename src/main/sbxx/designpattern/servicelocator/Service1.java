package main.sbxx.designpattern.servicelocator;

/**
 * @author Dair
 * @since
 */
public class Service1 implements Service {
	@Override
	public String getName() {
		return "Service1";
	}
	
	@Override
	public void execute() {
		System.out.println("execute Service1 ...");
	}
}
