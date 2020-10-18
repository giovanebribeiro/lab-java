package me.boaviagem.giovane.lab.discounts;

import me.boaviagem.giovane.lab.Budget;

public class DiscountPer5Itens implements Discount {

    private Discount nextDiscount;

    @Override
    public double calculate(Budget b){

        if(b.getItens().size() > 5){
            return b.getValue() * 0.1;
        }

        return this.nextDiscount.calculate(b);
        
    }

    @Override
    public void setNext(Discount d) {
        this.nextDiscount = d;
    }
    
}
