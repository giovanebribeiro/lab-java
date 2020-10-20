package me.boaviagem.giovane.lab.budget.states;

import me.boaviagem.giovane.lab.budget.Budget;

public class Finalized implements BudgetState {

    @Override
    public void applyExtraDiscount(Budget budget) {
        throw new RuntimeException("Discounts can't be applied on Finalized budgets");
    }

    @Override
    public void approve(Budget budget) {
        throw new RuntimeException("You can't approve a 'Finalized' budget");
    }

    @Override
    public void unnaprove(Budget budget) {
        throw new RuntimeException("You can't unnaprove a 'Finalized' budget");
    }

    @Override
    public void finalize(Budget budget) {
        throw new RuntimeException("You can't finalize a 'Finalized' budget");
    }
    
}
