package me.boaviagem.giovane.lab.discounts;

import me.boaviagem.giovane.lab.Budget;

public class NoDiscount implements Discount {

    @Override
    public double calculate(Budget b) {
        return 0;
    }

    @Override
    public void setNext(Discount d) {
        // not have the next discount. This is the end of line!
    }
    
}
