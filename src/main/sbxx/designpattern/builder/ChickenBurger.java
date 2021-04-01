package main.sbxx.designpattern.builder;

/**
 * @author Dair
 * @since
 */
public class ChickenBurger extends Burger{
	@Override
	public String name() {
		return "Chicken Burger";
	}
	
	@Override
	public float price() {
		return 10.5f;
	}
}
