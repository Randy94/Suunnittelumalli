package Komponentit;

import java.util.ArrayList;
import java.util.List;

import Main.Component;
import Main.ComponentComposite;

public class Case implements ComponentComposite  {
    private double price;
    private List<Component> caseParts = new ArrayList<>();
    
    public Case(double Price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        double yhtHinta = this.price;
        for (Component component : caseParts) {
            yhtHinta += component.getPrice();
        }
        return yhtHinta;
    }
    
    @Override
    public void addLaiteosa(Component part) {
        if (!caseParts.contains(part)) {
        	caseParts.add(part);
        }
    }
}