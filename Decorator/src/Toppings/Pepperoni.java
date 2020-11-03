package Toppings;

import Pizzas.Pizza;
import Pizzas.PizzaDecorator;

public class Pepperoni extends PizzaDecorator{
	private final Pizza pizza;
	
	// decorate luokka
	public Pepperoni(Pizza pizza) {
		this.pizza = pizza;
	}	
	
	public String getMenu() {
		return pizza.getMenu()+ ", Pepperoni (3)";
	
	}
	// lis‰t‰‰n kokonaishintaan rucolan hinta.
	public double getPrice() {
		return pizza.getPrice()+ 3;
	}

	
}