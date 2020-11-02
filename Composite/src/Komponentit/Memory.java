package Komponentit;

import Main.Component;

public class Memory implements Component {

	 private double price;
	    
	    public Memory(double price) {
	        this.price = price;
	    }

	    @Override
	    public double getPrice() {
	        return price;
	    }

}
