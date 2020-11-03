package Toppings;

import Pizzas.Pizza;
import Pizzas.PizzaDecorator;

public class Tomato extends PizzaDecorator{
	private final Pizza pizza;
	
	// decorate luokka
	public Tomato(Pizza pizza) {
		this.pizza = pizza;
	}	
	
	public String getMenu() {
		return pizza.getMenu()+ ", Tomato (0.25)";
	
	}
	// lis‰t‰‰n kokonaishintaan rucolan hinta.
	public double getPrice() {
		return pizza.getPrice()+ 0.25;
	}

	
}