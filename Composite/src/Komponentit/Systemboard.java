package Komponentit;

import java.util.ArrayList;
import java.util.List;

import Main.Component;
import Main.ComponentComposite;

public class Systemboard implements ComponentComposite {

    private double price;
    private List<Component> systemboardPart = new ArrayList<>();
    
    public Systemboard(double price) {
        this.price = price;
    }
    
    @Override
    public double getPrice() {
        double totalprice = this.price;
        for (Component laiteosa : systemboardPart) {
            totalprice += laiteosa.getPrice();
        }
        return totalprice;
    }
    
    @Override
    public void addLaiteosa(Component part) {
        if (!systemboardPart.contains(part)) {
        	systemboardPart.add(part);
        }
    }
}