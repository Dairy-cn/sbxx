package main.sbxx.designpattern.abstractfactory;

/**
 * @author Dair
 * @since
 */
public class FactoryProductor {
	
	public static AbstractFactory getFactory(String type) {
		if (type == null) {
			return null;
		}
		if ("shape".equalsIgnoreCase(type)) {
			return new ShapeFactory();
		} else if ("color".equalsIgnoreCase(type)) {
			return new ColorFactory();
		} else {
			return null;
		}
		
	}
	
}
