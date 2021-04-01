package main.sbxx.designpattern.builder;

/**
 * @author Dair
 * @since
 */
public class Coke extends ColdDrink {
	
	
	@Override
	public String name() {
		return "Coke";
	}
	
	@Override
	public float price() {
		return 15f;
	}
}
