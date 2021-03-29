package main.sbxx.designpattern.nullobjectPattern;

import java.util.Optional;

/**
 * @author Dair
 * @since
 */
public class Test {
	
	
	
	public static void main(String[] args) {
		
		AbstractCustomer abstractCustomer1=CustomerFactory.getCustomer("Dair");
		AbstractCustomer abstractCustomer2=CustomerFactory.getCustomer("Joe");
		AbstractCustomer abstractCustomer3=CustomerFactory.getCustomer("huahua");
		AbstractCustomer abstractCustomer4=CustomerFactory.getCustomer("xiaohua");
		
		
		System.out.println("customer");
		System.out.println(abstractCustomer1.getName());
		System.out.println(abstractCustomer2.getName());
		System.out.println(abstractCustomer3.getName());
		System.out.println(abstractCustomer4.getName());
		Optional
		
	}
}
