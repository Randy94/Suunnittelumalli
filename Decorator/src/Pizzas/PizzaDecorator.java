package Pizzas;

public abstract class PizzaDecorator implements Pizza {

	// Decorator luokka joka "koristelee" pizzoja täyttteillä ja jota kaikki täytteet extendaa.
	
	@Override
	public String getMenu() {
		return "Toppings";
		
	}
}
