package main.sbxx.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dair
 * @since
 */
public class Meal {
	
	private List<Item> itemList = new ArrayList<>();
	
	
	public void addItem(Item item) {
		itemList.add(item);
	}
	
	
	public float getPrice() {
		float price = 0.0f;
		for (Item item : itemList) {
			price += item.price();
		}
		return price;
	}
	
	public void  showItems(){
		for (Item item : itemList) {
			System.out.print("Item : "+item.name());
			System.out.print(", Packing : "+item.packing().pack());
			System.out.println(", Price : "+item.price());
		}
	}
	
}
