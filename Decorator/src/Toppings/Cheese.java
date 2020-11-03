package Toppings;

import Pizzas.Pizza;
import Pizzas.PizzaDecorator;

public class Cheese extends PizzaDecorator{
	private final Pizza pizza;
	
	// decorate luokka
	public Cheese(Pizza pizza) {
		this.pizza = pizza;
	}	
	
	public String getMenu() {
		return pizza.getMenu()+ ", Cheese (0.10)";
	
	}
	// lis‰t‰‰n kokonaishintaan rucolan hinta.
	public double getPrice() {
		return pizza.getPrice()+ 0.10;
	}

	
}