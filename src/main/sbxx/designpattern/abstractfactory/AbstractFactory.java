package main.sbxx.designpattern.abstractfactory;

/**
 * @author Dair
 * @since
 */
public abstract class AbstractFactory {
	
	
	abstract Shape getShape(String shapeType);
	
	abstract Color getColor(String color);
	
}
