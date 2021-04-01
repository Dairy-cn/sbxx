package main.sbxx.designpattern.abstractfactory;

/**
 * @author Dair
 * @since
 */
public class ColorFactory extends AbstractFactory {
	@Override
	Shape getShape(String shapeType) {
		return null;
	}
	
	@Override
	Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if ("red".equalsIgnoreCase(color)) {
			return new Red();
		} else if ("green".equalsIgnoreCase(color)) {
			return new Green();
		} else if ("Blue".equalsIgnoreCase(color)) {
			return new Blue();
		} else {
			return null;
		}
	}
}
