package main.sbxx.designpattern.factory;

/**
 * @author Dair
 * @since
 */
public class Test {
	
	public static void main(String[] args) {
		ShapeFactory shapeFactory=new ShapeFactory();
		Shape circle = shapeFactory.getShape("Circle");
		circle.draw();
		Shape square = shapeFactory.getShape("square");
		square.draw();
		Shape rectangle = shapeFactory.getShape("Rectangle");
		rectangle.draw();
	}
}
