package me.boaviagem.giovane.lab.taxes;

import me.boaviagem.giovane.lab.Budget;

public class ICPP extends ConditionalTax {

    public double calculate(Budget budget) {
        if(budget.getValue() > 500){
            return budget.getValue() * 0.05;
        }
        return budget.getValue() * 0.07;
    }

    @Override
    double calculateTaxForm2(Budget budget) {
        return budget.getValue() * 0.07;
    }

    @Override
    double calculateTaxForm1(Budget budget) {
        return budget.getValue() * 0.05;
    }

    @Override
    boolean shouldCalculateUsingForm1(Budget budget) {
        return budget.getValue() > 500;
    }
    
}
