package me.boaviagem.giovane.lab.budget.states;

import me.boaviagem.giovane.lab.budget.Budget;

public class Unnaproved implements BudgetState {

    @Override
    public void applyExtraDiscount(Budget budget) {
        throw new RuntimeException("Discounts can't be applied on Unapproved budgets");
    }

    @Override
    public void approve(Budget budget) {
        throw new RuntimeException("You can't approve a 'Unnaproved' budget");
    }

    @Override
    public void unnaprove(Budget budget) {
        throw new RuntimeException("You can't unnaprove a 'Unnaproved' budget");
    }

    @Override
    public void finalize(Budget budget) {
        budget.setActualState(new Finalized());
    }
    
}
