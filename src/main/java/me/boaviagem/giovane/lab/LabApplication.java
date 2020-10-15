package me.boaviagem.giovane.lab;

import me.boaviagem.giovane.lab.taxes.ICCC;
import me.boaviagem.giovane.lab.taxes.ICMS;
import me.boaviagem.giovane.lab.taxes.ISS;
import me.boaviagem.giovane.lab.taxes.Tax;

//@SpringBootApplication
public class LabApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LabApplication.class, args);

		Tax iss = new ISS();
		Tax icms = new ICMS();
		Tax iccc = new ICCC();

		Budget budget = new Budget(500);

		System.out.println("ISS tax = " + iss.calculate(budget));
		System.out.println("ICMS tax = " + icms.calculate(budget));
		System.out.println("ICCC tax = " + iccc.calculate(budget));
		
		
	}

}
