package me.boaviagem.giovane.lab.budget.states;

import me.boaviagem.giovane.lab.budget.Budget;

public class OnApproval implements BudgetState {

    @Override
    public void applyExtraDiscount(Budget budget) {
        budget.setValue(budget.getValue() - budget.getValue() * 0.05);
    }


    @Override
    public void approve(Budget budget) {
        budget.setActualState(new Approved());
    }

    @Override
    public void unnaprove(Budget budget) {
        budget.setActualState(new Unnaproved());
    }

    @Override
    public void finalize(Budget budget) {
        throw new RuntimeException("You can't finalize a 'On Approval' budget.");
    }
    
}
