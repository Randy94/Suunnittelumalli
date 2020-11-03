package Toppings;

import Pizzas.Pizza;
import Pizzas.PizzaDecorator;

public class Pineapple extends PizzaDecorator{
	private final Pizza pizza;
	
	// decorate luokka
	public Pineapple(Pizza pizza) {
		this.pizza = pizza;
	}	
	
	public String getMenu() {
		return pizza.getMenu()+ ", Pineapple (0.60)";
	
	}
	// lis‰t‰‰n kokonaishintaan rucolan hinta.
	public double getPrice() {
		return pizza.getPrice()+ 0.60;
	}

	
}