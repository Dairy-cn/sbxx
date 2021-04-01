package main.sbxx.designpattern.abstractfactory;

/**
 * @author Dair
 * @since
 */
public class Test {
	
	public static void main(String[] args) {
		AbstractFactory shape = FactoryProductor.getFactory("shape");
		Shape square = shape.getShape("square");
		square.draw();
		
		AbstractFactory color = FactoryProductor.getFactory("color");
		Color blue = color.getColor("blue");
		blue.fill();
		
	}
}
