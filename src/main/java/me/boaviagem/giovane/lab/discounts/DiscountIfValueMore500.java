package me.boaviagem.giovane.lab.discounts;

import me.boaviagem.giovane.lab.Budget;

public class DiscountIfValueMore500 implements Discount{

    private Discount nextDiscount;

    @Override
    public double calculate(Budget b){

        if(b.getValue() > 500){
            return b.getValue() * 0.07;
        }

        return this.nextDiscount.calculate(b);
    }

    @Override
    public void setNext(Discount d) {
        this.nextDiscount = d;
    }

}
