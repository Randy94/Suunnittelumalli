package Komponentit;

import Main.Component;

public class Cpucooler implements Component{
	  private double price;

	    public Cpucooler(double price) {
	        this.price = price;
	    }
	    
	    @Override
	    public double getPrice() {
	        return price;
	    }
}
