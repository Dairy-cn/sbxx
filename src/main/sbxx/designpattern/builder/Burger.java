package main.sbxx.designpattern.builder;

/**
 * @author Dair
 * @since
 */
public abstract  class Burger implements Item {
	
	
	@Override
	public Packing packing() {
		return new Wrapper();
	}
	
	@Override
	public abstract float price();
}
