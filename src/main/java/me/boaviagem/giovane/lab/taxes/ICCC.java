package me.boaviagem.giovane.lab.taxes;

import me.boaviagem.giovane.lab.Budget;

public class ICCC implements Tax {

    @Override
    public double calculate(Budget budget) {

        double value = budget.getValue();

        if(value < 1000){
            return value * 0.05;
        } else if (value <= 3000){
            return value * 0.07;
        } else {
            return value * 0.08 + 30;
        }
    }


    
}
