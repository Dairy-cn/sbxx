package main.sbxx.designpattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dair
 * @since
 */
public class Broket {
	private List<Order> orders=new ArrayList<>();
	
	
	public void takeOrder(Order order){
		orders.add(order);
	}
	
	public void placeOrders(){
		for (Order order : orders) {
			order.execute();
		}
		orders.clear();
	}
	
}
