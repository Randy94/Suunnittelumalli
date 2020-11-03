package Toppings;

import Pizzas.Pizza;
import Pizzas.PizzaDecorator;

public class Chicken extends PizzaDecorator{
	private final Pizza pizza;
	
	// decorate luokka
	public Chicken(Pizza pizza) {
		this.pizza = pizza;
	}	
	
	public String getMenu() {
		return pizza.getMenu()+ ", Chicken (1.50)";
	
	}
	// lis‰t‰‰n kokonaishintaan rucolan hinta.
	public double getPrice() {
		return pizza.getPrice()+ 1.50;
	}

	
}