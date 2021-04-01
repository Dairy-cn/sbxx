package main.sbxx.designpattern.builder;

/**
 * @author Dair
 * @since
 */
public abstract  class ColdDrink implements Item {
	
	@Override
	public Packing packing() {
		return new Bottle();
	}
}
