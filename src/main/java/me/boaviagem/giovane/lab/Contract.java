package me.boaviagem.giovane.lab;

import java.util.Calendar;

public class Contract {

    private Calendar data;
    private String cliente;
    private ContractType tipo;

    public Contract(Calendar data, String cliente, ContractType tipo) {
        this.data = data;
        this.cliente = cliente;
        this.tipo = tipo;
    }

    public ContractType getTipo() {
        return tipo;
    }

    public Calendar getData() {
        return data;
    }
    public void setData(Calendar data) {
        this.data = data;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void avanca() {
        if(tipo == TipoContrato.NOVO) tipo = TipoContrato.EM_ANDAMENTO;
        else if(tipo == TipoContrato.EM_ANDAMENTO) tipo = TipoContrato.ACERTADO;
        else if(tipo == TipoContrato.ACERTADO) tipo = TipoContrato.CONCLUIDO;
    }

}
