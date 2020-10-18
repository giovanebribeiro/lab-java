package me.boaviagem.giovane.lab.taxes;

import me.boaviagem.giovane.lab.Budget;

public class ISS extends Tax {

    public ISS(Tax anotherTax) {
        super(anotherTax);
    }    

    public ISS() {
        super();
    }

    @Override
    public double calculate(Budget budget) {
        return budget.getValue() * 0.06 + calculateFromAnotherTax(budget);
    }
    
}
