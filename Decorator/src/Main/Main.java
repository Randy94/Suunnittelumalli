package Main;

import java.text.DecimalFormat;

import Pizzas.*;
import Toppings.*;

public class Main {

	
	public static void main(String[] args) {
		Pizza pizza = new ChickenBbq();
		
		
		pizza = new Chicken(pizza);
		pizza = new BbqSauce(pizza);
		pizza = new Jalopeno(pizza);
		pizza = new Bacon(pizza);
		pizza = new Cheese(pizza);
		
		
		System.out.print("Menu:  "+pizza.getMenu());
		System.out.print("\nTotal Price: "+pizza.getPrice()+"€");
		
		
		Pizza pizza2 = new VegetarianPizza();
		
		pizza2 = new Rucola(pizza2);
		pizza2 = new Tomato(pizza2);
		pizza2 = new Spinach(pizza2);
		pizza2 = new Olives(pizza2);
		pizza2 = new Cheese(pizza2);
		
		System.out.print("\nMenu:  "+pizza2.getMenu());
		System.out.print("\nTotal Price: "+pizza2.getPrice()+"€");
		
		
		Pizza pizza3 = new HawajiPizza();
		
		pizza3 = new Cheese(pizza2);
		pizza3 = new Pineapple(pizza2);
		pizza3 = new Ham(pizza2);

		System.out.print("\nMenu:  "+pizza3.getMenu());
		System.out.print("\nTotal Price: "+pizza3.getPrice()+"€");
	}
}
