package main.sbxx.designpattern.factory;

/**
 * @author Dair
 * @since
 */
public class CircleFactory extends AbstractFactory {
	@Override
	Shape getFactory() {
		return new Circle();
	}
}
