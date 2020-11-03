package Toppings;

import Pizzas.Pizza;
import Pizzas.PizzaDecorator;

public class Olives extends PizzaDecorator{
	private final Pizza pizza;
	
	// decorate luokka
	public Olives(Pizza pizza) {
		this.pizza = pizza;
	}	
	
	public String getMenu() {
		return pizza.getMenu()+ ", Olives (1)";
	
	}
	// lis‰t‰‰n kokonaishintaan rucolan hinta.
	public double getPrice() {
		return pizza.getPrice()+ 1;
	}

	
}