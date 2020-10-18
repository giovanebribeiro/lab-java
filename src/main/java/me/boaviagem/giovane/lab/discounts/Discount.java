package me.boaviagem.giovane.lab.discounts;

import me.boaviagem.giovane.lab.Budget;

public interface Discount {

    double calculate(Budget b);
    void setNext(Discount d);
    
}
