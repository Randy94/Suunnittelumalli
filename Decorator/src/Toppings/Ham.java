package Toppings;

import Pizzas.Pizza;
import Pizzas.PizzaDecorator;

public class Ham extends PizzaDecorator{
	private final Pizza pizza;
	
	// decorate luokka
	public Ham(Pizza pizza) {
		this.pizza = pizza;
	}	
	
	public String getMenu() {
		return pizza.getMenu()+ ", Ham (2.25)";
	
	}
	// lis‰t‰‰n kokonaishintaan rucolan hinta.
	public double getPrice() {
		return pizza.getPrice()+ 2.25;
	}

	
}