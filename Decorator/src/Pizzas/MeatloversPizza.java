package Pizzas;

public class MeatloversPizza implements Pizza{

	@Override
	public String getMenu() {
		return "MeatloversPizza (12.50)";
	}

	@Override
	public double getPrice() {
		return 12.50;
	}

}
