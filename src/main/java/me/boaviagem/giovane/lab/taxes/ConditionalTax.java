package me.boaviagem.giovane.lab.taxes;

import me.boaviagem.giovane.lab.Budget;

public abstract class ConditionalTax implements Tax {

    @Override
    public double calculate(Budget budget) {
        
        if(shouldCalculateUsingForm1(budget)){
            return calculateTaxForm1(budget);
        }
        return calculateTaxForm2(budget);
    }

    abstract double calculateTaxForm2(Budget budget);

    abstract double calculateTaxForm1(Budget budget);

    abstract boolean shouldCalculateUsingForm1(Budget budget);
    
}
