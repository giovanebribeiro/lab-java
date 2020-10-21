package me.boaviagem.giovane.lab;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class InvoiceBuilder {

    private String company;
    private String cnpj;

    private List<Item> itens;
    private double total;
    private double taxes;
    private Calendar creationDate;
    private String obs;

    public InvoiceBuilder() {
        this.itens = new LinkedList<Item>();
        this.total = 0;
        this.taxes = 0;
    }

    public InvoiceBuilder fromCompany(String company) {
        this.company = company;
        return this;
    }

    public InvoiceBuilder withCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public InvoiceBuilder addItem(Item item) {
        this.itens.add(item);
        this.total += item.getValue();
        this.taxes += item.getValue() * 0.05;
        return this;
    }

    public InvoiceBuilder atNow(){
        this.creationDate = Calendar.getInstance();
        return this;
    }

    public InvoiceBuilder withObservations(String obs){
        this.obs = obs;
        return this;
    }

    public Invoice build(){
        return new Invoice(company, cnpj, creationDate, total, taxes, itens, obs);
    }
    
}
