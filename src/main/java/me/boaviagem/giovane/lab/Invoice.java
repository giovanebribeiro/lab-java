package me.boaviagem.giovane.lab;

import java.util.Calendar;
import java.util.List;

public class Invoice {

    private String company;
    private String cnpj;
    private Calendar creationDate;
    private double total;
    private double taxes;
    private List<Item> itens;
    private String obs;

    public Invoice(String company, String cnpj, Calendar creationDate, double total, double taxes, List<Item> itens, String obs) {
        this.cnpj = cnpj;
        this.creationDate = creationDate;
        this.itens = itens;
        this.company = company;
        this.obs = obs;
        this.taxes = taxes;
        this.total = total;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @return the creationDate
     */
    public Calendar getCreationDate() {
        return creationDate;
    }

    /**
     * @return the itens
     */
    public List<Item> getItens() {
        return itens;
    }

    /**
     * @return the name
     */
    public String getName() {
        return company;
    }

    /**
     * @return the obs
     */
    public String getObs() {
        return obs;
    }

    /**
     * @return the taxes
     */
    public double getTaxes() {
        return taxes;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }


    
}
