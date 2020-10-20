package me.boaviagem.giovane.lab.budget.states;

import me.boaviagem.giovane.lab.budget.Budget;

public interface BudgetState {

    void applyExtraDiscount(Budget budget);

    void approve(Budget budget);
    void unnaprove(Budget budget);
    void finalize(Budget budget);
    
}
