package Komponentit;

import Main.Component;

public class Gpu implements Component{
	 private double price;

	    public Gpu(double price) {
	        this.price = price;
	    }
	    
	    @Override
	    public double getPrice() {
	        return price;
	    }
}
