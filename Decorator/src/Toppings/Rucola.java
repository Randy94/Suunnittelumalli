package Toppings;

import Pizzas.Pizza;
import Pizzas.PizzaDecorator;

public class Rucola extends PizzaDecorator{
	private final Pizza pizza;
	
	// decorate luokka
	public Rucola(Pizza pizza) {
		this.pizza = pizza;
	}	
	
	public String getMenu() {
		return pizza.getMenu()+ ", Rucola (1.25)";
	
	}
	// lis‰t‰‰n kokonaishintaan rucolan hinta.
	public double getPrice() {
		return pizza.getPrice()+ 1.25;
	}

	
}
