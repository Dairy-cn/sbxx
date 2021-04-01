package main.sbxx.designpattern.simplefactory;

/**
 * @author Dair
 * @since
 */
public class ShapeFactory {
	
	
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("Square")) {
			return new Square();
		} else {
			return null;
		}
	}
}
