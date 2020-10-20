package me.boaviagem.giovane.lab.budget;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import me.boaviagem.giovane.lab.budget.states.BudgetState;
import me.boaviagem.giovane.lab.budget.states.OnApproval;


public class Budget {

    private double value;
    private final List<Item> itens;

    private BudgetState actualState; 

    public Budget(double value){
        this.value = value;
        this.itens = new LinkedList<Item>();
        this.actualState = new OnApproval();
    }

    public double getValue(){
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setActualState(BudgetState actualState) {
        this.actualState = actualState;
    }

    public void addItem(Item item){
        this.itens.add(item);
    }

    public List<Item> getItens(){
        return Collections.unmodifiableList(itens);
    }

    
    public void applyExtraDiscount() {
        actualState.applyExtraDiscount(this);
    }
    
    public void approve(){
        this.actualState.approve(this);
    }

    public void unnaprove(){
        this.actualState.unnaprove(this);
    }

    public void finalize(){
        this.actualState.finalize(this);
    }
    

}