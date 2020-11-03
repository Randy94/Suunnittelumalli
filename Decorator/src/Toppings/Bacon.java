package Toppings;

import Pizzas.Pizza;
import Pizzas.PizzaDecorator;

public class Bacon extends PizzaDecorator{
	private final Pizza pizza;
	
	// decorate luokka
	public Bacon(Pizza pizza) {
		this.pizza = pizza;
	}	
	
	public String getMenu() {
		return pizza.getMenu()+ ", Bacon (3)";
	
	}
	// lis‰t‰‰n kokonaishintaan rucolan hinta.
	public double getPrice() {
		return pizza.getPrice()+ 3;
	}

	
}