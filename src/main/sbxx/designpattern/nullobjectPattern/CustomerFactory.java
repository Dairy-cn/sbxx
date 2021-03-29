package main.sbxx.designpattern.nullobjectPattern;

/**
 * @author Dair
 * @since
 */
public class CustomerFactory {
	private final static String[] names = {"Dair", "Joe", "Don"};
	
	public static AbstractCustomer getCustomer(String name) {
		
		for (int i = 0; i < names.length; i++) {
			if (names[i].equalsIgnoreCase(name)) {
				return new RealCustomer(name);
			}
		}
		return new NullObjectCustomer();
	}
}
