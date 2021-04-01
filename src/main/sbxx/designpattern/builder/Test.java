package main.sbxx.designpattern.builder;

/**
 * @author Dair
 * @since
 */
public class Test {
	
	public static void main(String[] args) {
		Meal vegMeal=new MealBuilder().getVegMeal();
		vegMeal.showItems();
		System.out.println("套餐一金额总额："+vegMeal.getPrice());
		
		Meal noVegMeal=new MealBuilder().getNoVegMeal();
		noVegMeal.showItems();
		System.out.println("套餐二金额总额："+noVegMeal.getPrice());
		
	}
}
