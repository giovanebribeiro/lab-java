package me.boaviagem.giovane.lab;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class Budget {

    private final double value;
    private final List<Item> itens;

    public Budget(double value){
        this.value = value;
        this.itens = new LinkedList<Item>();
    }

    public double getValue(){
        return this.value;
    }

    public void addItem(Item item){
        this.itens.add(item);
    }

    public List<Item> getItens(){
        return Collections.unmodifiableList(itens);
    }

}
