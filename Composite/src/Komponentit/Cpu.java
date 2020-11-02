package Komponentit;

import Main.Component;

public class Cpu implements Component{

	private double price;
    
    public Cpu(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

	
}
