package me.boaviagem.giovane.lab;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Budget {

    private final double value;
    private final List<Item> itens;

    public Budget(double value){
        this.value = value;
        itens = new LinkedList<Item>();        
    }

    public double getValue(){
        return this.value;
    }

    public void addItem(Item i){
        this.itens.add(i);
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens); // lista não será modificada pelo mundo externo
    }

    public boolean itemExist(String name){
        for(Item item: itens){
            if(item.getName().equalsIgnoreCase(name)){
                return true;
            }
        }

        return false;
    }
    
}
