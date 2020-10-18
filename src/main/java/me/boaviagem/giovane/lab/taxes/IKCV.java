package me.boaviagem.giovane.lab.taxes;

import me.boaviagem.giovane.lab.Budget;
import me.boaviagem.giovane.lab.Item;

public class IKCV extends ConditionalTax {

    private boolean isSomeItemMoreThan100(Budget budget) {
        for(Item item : budget.getItens()){
            if(item.getValue() > 100){
                return true;
            }
        }
        return false;
    }

    @Override
    double calculateTaxForm2(Budget budget) {
        return budget.getValue() * 0.06;
    }

    @Override
    double calculateTaxForm1(Budget budget) {
        return budget.getValue() * 0.1;
    }

    @Override
    boolean shouldCalculateUsingForm1(Budget budget) {
        return (budget.getValue() > 500 && isSomeItemMoreThan100(budget));
    }
    
}
