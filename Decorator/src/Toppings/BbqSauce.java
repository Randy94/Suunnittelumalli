package Toppings;

import Pizzas.Pizza;
import Pizzas.PizzaDecorator;

public class BbqSauce extends PizzaDecorator{
	private final Pizza pizza;
	
	// decorate luokka
	public BbqSauce(Pizza pizza) {
		this.pizza = pizza;
	}	
	
	public String getMenu() {
		return pizza.getMenu()+ ", Bbqsauce (0.25)";
	
	}
	// lis‰t‰‰n kokonaishintaan rucolan hinta.
	public double getPrice() {
		return pizza.getPrice()+ 0.25;
	}

	
}