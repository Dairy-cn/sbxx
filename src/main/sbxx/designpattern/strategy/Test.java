package main.sbxx.designpattern.strategy;

/**
 * @author Dair
 * @since
 */
public class Test {
	
	
	public static void main(String[] args) {
		int numA=10;
		int numB=2;
		Content content=new Content(new OpearationAdd());
		System.out.println(content.executStrategy(numA,numB));
		
		Content content2=new Content(new OpearationSubstract());
		System.out.println(content2.executStrategy(numA,numB));
		
		Content content3=new Content(new OpearationMultiply());
		System.out.println(content3.executStrategy(numA,numB));
	}
}
