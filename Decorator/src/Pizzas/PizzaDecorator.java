package Pizzas;

public abstract class PizzaDecorator implements Pizza {

	// Decorator luokka joka "koristelee" pizzoja t�yttteill� ja jota kaikki t�ytteet extendaa.
	
	@Override
	public String getMenu() {
		return "Toppings";
		
	}
}
