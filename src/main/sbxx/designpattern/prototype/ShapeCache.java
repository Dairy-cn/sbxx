package main.sbxx.designpattern.prototype;

import java.util.HashMap;

/**
 * @author Dair
 * @since
 */
public class ShapeCache {
	
	private static HashMap<String, Shape> shapeHashMap = new HashMap<>();
	
	
	public static Shape getShape(String shapeId) {
		Shape shape = shapeHashMap.get(shapeId);
		return (Shape) shape.clone();
	}
	
	
	public static void loadCache() {
		
		Circle circle=new Circle();
		circle.setId("1");
		shapeHashMap.put(circle.getId(),circle);
		Rectangle rectangle=new Rectangle();
		rectangle.setId("2");
		shapeHashMap.put(rectangle.getId(),rectangle);
		Square square=new Square();
		square.setId("3");
		shapeHashMap.put(square.getId(),square);
		
	}
}
