package Pizzas;

public class HawajiPizza implements Pizza {

	@Override
	public String getMenu() {
		return "HawajiPizza (10)";
	}

	@Override
	public double getPrice() {
		return 10;
	}

}
