package main.sbxx.designpattern.command;

/**
 * @author Dair
 * @since
 */
public class Test {
	public static void main(String[] args) {
		Stock zkStock = new Stock();
		BuyStock buyStock = new BuyStock(zkStock);
		SellStock sellStock = new SellStock(zkStock);
		Broket broket=new Broket();
		broket.takeOrder(buyStock);
		broket.takeOrder(sellStock);
		broket.placeOrders();
	}
}
