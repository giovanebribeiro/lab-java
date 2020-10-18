package me.boaviagem.giovane.lab.taxes;

import me.boaviagem.giovane.lab.Budget;

public class ICMS extends Tax {

    public ICMS(Tax anotherTax) {
        super(anotherTax);
    }

    public ICMS(){}

    @Override
    public double calculate(Budget budget) {
        return budget.getValue() * 0.05 + 50 + calculateFromAnotherTax(budget);
    }
    
}
