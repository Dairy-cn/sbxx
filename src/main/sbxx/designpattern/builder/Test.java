package main.sbxx.designpattern.builder;

/**
 * @author Dair
 * @since
 */
public class Test {
	
	public static void main(String[] args) {
		Meal meal=new Meal();
		meal.addItem(new Pepsi());
		meal.addItem(new VegBurger());
		meal.showItems();
		System.out.println("套餐一金额总额："+meal.getPrice());
		meal=new Meal();
		meal.addItem(new Coke());
		meal.addItem(new ChickenBurger());
		meal.showItems();
		
		System.out.println("套餐二金额总额："+meal.getPrice());
		
	}
}
