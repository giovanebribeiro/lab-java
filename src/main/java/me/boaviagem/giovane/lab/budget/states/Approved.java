package me.boaviagem.giovane.lab.budget.states;

import me.boaviagem.giovane.lab.budget.Budget;

public class Approved implements BudgetState {

    @Override
    public void applyExtraDiscount(Budget budget) {
        budget.setValue(budget.getValue() - budget.getValue() * 0.02);
    }

    @Override
    public void approve(Budget budget) {
        throw new RuntimeException("You can't approve a 'Approved' budget.");
    }

    @Override
    public void unnaprove(Budget budget) {
        throw new RuntimeException("You can't approve a 'Unnaproved' budget.");
    }

    @Override
    public void finalize(Budget budget) {
        budget.setActualState(new Finalized());
    }
    
}
