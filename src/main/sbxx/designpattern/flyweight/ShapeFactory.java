package main.sbxx.designpattern.flyweight;

import java.util.HashMap;

/**
 * @author Dair
 * @since
 */
public class ShapeFactory {
	
	
	private final static HashMap<String,Shape> map=new HashMap<>();
	
	
	public static Shape getMap(String color) {
		Circle circle = (Circle) map.get(color);
		if(circle==null){
			circle=new Circle(color);
			map.put(color,circle);
			System.out.println("create circle of color:"+color);
		}
		return circle;
	}
}
