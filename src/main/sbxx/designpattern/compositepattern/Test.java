package main.sbxx.designpattern.compositepattern;

/**
 * @author Dair
 * @since
 */
public class Test {
	
	public static void main(String[] args) {
		Employee joe = new Employee("Joe", "CEO", 30000);
		
		Employee person1 = new Employee("person1", "xx", 3000);
		Employee person2 = new Employee("person2", "yy", 4021);

		Employee person11 = new Employee("person11", "xx1", 2000);
		Employee person12 = new Employee("person12", "xx2", 1000);

		Employee person21 = new Employee("person21", "yy1", 2500);
		Employee person22 = new Employee("person22", "yy2", 1500);
		joe.add(person1);
		joe.add(person2);
		
		person1.add(person11);
		person1.add(person12);
		
		person2.add(person21);
		person2.add(person22);
		System.out.println(joe);
		for (Employee e : joe.getSubordinates()) {
			System.out.println(e);
			for (Employee e1 : e.getSubordinates()) {
				System.out.println(e1);
			}
		}
	}
	
	
}
