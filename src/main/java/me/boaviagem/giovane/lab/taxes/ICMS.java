package me.boaviagem.giovane.lab.taxes;

import me.boaviagem.giovane.lab.Budget;

public class ICMS implements Tax {

    @Override
    public double calculate(Budget budget) {
        return budget.getValue() * 0.05 + 50;
    }
    
}
