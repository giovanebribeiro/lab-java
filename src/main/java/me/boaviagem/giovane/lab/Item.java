package me.boaviagem.giovane.lab;

public class Item {

    private String name;
    private double value;

    public Item(String name, double value) {        
        super();
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }
    
    public double getValue() {
        return value;
    }
}
