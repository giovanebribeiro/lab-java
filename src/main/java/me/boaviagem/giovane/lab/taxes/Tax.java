package me.boaviagem.giovane.lab.taxes;

import me.boaviagem.giovane.lab.Budget;

public interface Tax {
    double calculate(Budget budget);    
}
