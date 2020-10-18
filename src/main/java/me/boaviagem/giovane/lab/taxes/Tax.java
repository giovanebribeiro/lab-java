package me.boaviagem.giovane.lab.taxes;

import me.boaviagem.giovane.lab.Budget;

public abstract class Tax {

    protected Tax anotherTax;

    public Tax(Tax anotherTax) {
        this.anotherTax = anotherTax;
    }

    public Tax(){}

    public abstract double calculate(Budget budget);    

    protected double calculateFromAnotherTax(Budget budget){
        if(anotherTax == null){
            return 0;
        }
        return anotherTax.calculate(budget);
    }
}
