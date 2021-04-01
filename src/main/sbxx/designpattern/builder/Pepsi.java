package main.sbxx.designpattern.builder;

/**
 * @author Dair
 * @since
 */
public class Pepsi extends ColdDrink {
	@Override
	public String name() {
		return "Pepsi";
	}
	
	@Override
	public float price() {
		return 14f;
	}
}
