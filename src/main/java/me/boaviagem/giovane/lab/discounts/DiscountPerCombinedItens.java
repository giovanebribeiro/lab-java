package me.boaviagem.giovane.lab.discounts;

import me.boaviagem.giovane.lab.Budget;

public class DiscountPerCombinedItens implements Discount {

    private Discount nextDiscount;

    @Override
    public double calculate(Budget b) {
        if(b.itemExist("LAPIS") && b.itemExist("CANETA")){
            return b.getValue() * 0.05;
        }
        return this.nextDiscount.calculate(b);
    }

    @Override
    public void setNext(Discount d) {
        this.nextDiscount = d;

    }
    
}
