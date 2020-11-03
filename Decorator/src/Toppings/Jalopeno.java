package Toppings;

import Pizzas.Pizza;
import Pizzas.PizzaDecorator;

public class Jalopeno extends PizzaDecorator{
	private final Pizza pizza;
	
	// decorate luokka
	public Jalopeno(Pizza pizza) {
		this.pizza = pizza;
	}	
	
	public String getMenu() {
		return pizza.getMenu()+ ", Jalopeno (0.75)";
	
	}
	// lis‰t‰‰n kokonaishintaan rucolan hinta.
	public double getPrice() {
		return pizza.getPrice()+ 0.75;
	}

	
}