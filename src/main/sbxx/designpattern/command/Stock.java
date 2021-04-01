package main.sbxx.designpattern.command;

/**
 * @author Dair
 * @since
 */
public class Stock {
 
	private String name="zk";
	
	private int quantity=12;
	
	public void buy(){
		System.out.println(toString()+"buy");
	}
	
	public void sell(){
		System.out.println(toString()+"sell");
	}
	
	@Override
	public String toString() {
		return "Stock{" +
				"name='" + name + '\'' +
				", quantity=" + quantity +
				'}';
	}
}
