package me.boaviagem.giovane.lab.actions;

import me.boaviagem.giovane.lab.IActionAfterInvoice;
import me.boaviagem.giovane.lab.Invoice;

public class Print implements IActionAfterInvoice {

    @Override
    public void run(Invoice i) {
        System.out.println("Invoice printed!");

    }
    
}
