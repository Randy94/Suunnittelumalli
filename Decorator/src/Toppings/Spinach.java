package Toppings;

import Pizzas.Pizza;
import Pizzas.PizzaDecorator;

public class Spinach extends PizzaDecorator{
	private final Pizza pizza;
	
	// decorate luokka
	public Spinach(Pizza pizza) {
		this.pizza = pizza;
	}	
	
	public String getMenu() {
		return pizza.getMenu()+ ", Spinach (0.50)";
	
	}
	// lis‰t‰‰n kokonaishintaan rucolan hinta.
	public double getPrice() {
		return pizza.getPrice()+ 0.50;
	}

	
}