package Pizzas;

public class ChickenBbq implements Pizza {

	@Override
	public String getMenu() {
		return "Chickenbbqpizza (14)";
	}

	@Override
	public double getPrice() {
		return 14;
	}

}
