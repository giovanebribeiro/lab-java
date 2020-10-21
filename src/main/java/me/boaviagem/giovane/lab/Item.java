package me.boaviagem.giovane.lab;

public class Item {

    private String name;
    private double value;

    public Item(String name, double value) {
        this.name = name;
        this.value = value;
    }    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the value
     */
    public double getValue() {
        return value;
    }

}
