package main.sbxx.designpattern.abstractfactory;

/**
 * @author Dair
 * @since
 */
public class ShapeFactory extends AbstractFactory {
	
	
	@Override
	Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if ("circle".equalsIgnoreCase(shapeType)) {
			return new Circle();
		} else if ("Rectangle".equalsIgnoreCase(shapeType)) {
			return new Rectangle();
		} else if ("Square".equalsIgnoreCase(shapeType)) {
			return new Square();
		} else {
			return null;
		}
	}
	
	@Override
	Color getColor(String color) {
		return null;
	}
}
