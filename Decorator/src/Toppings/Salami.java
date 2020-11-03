package Toppings;

import Pizzas.Pizza;
import Pizzas.PizzaDecorator;

public class Salami extends PizzaDecorator{
	private final Pizza pizza;
	
	// decorate luokka
	public Salami(Pizza pizza) {
		this.pizza = pizza;
	}	
	
	public String getMenu() {
		return pizza.getMenu()+ ", Salami (2)";
	
	}
	// lis‰t‰‰n kokonaishintaan rucolan hinta.
	public double getPrice() {
		return pizza.getPrice()+ 2;
	}

	
}