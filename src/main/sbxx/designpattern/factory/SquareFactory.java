package main.sbxx.designpattern.factory;

/**
 * @author Dair
 * @since
 */
public class SquareFactory extends AbstractFactory {
	
	
	@Override
	Shape getFactory() {
		return new Square();
	}
}
