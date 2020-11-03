package Pizzas;

public class VegetarianPizza implements Pizza {
	
	@Override
	public String getMenu() {
		return "VegetarianPizza(13)";
	}

	@Override
	public double getPrice() {
		return 13;
	}

}
