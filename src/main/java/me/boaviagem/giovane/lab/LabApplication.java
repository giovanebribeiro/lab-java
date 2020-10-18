package me.boaviagem.giovane.lab;

import me.boaviagem.giovane.lab.taxes.ICCC;
import me.boaviagem.giovane.lab.taxes.ICMS;
import me.boaviagem.giovane.lab.taxes.ICPP;
import me.boaviagem.giovane.lab.taxes.IKCV;
import me.boaviagem.giovane.lab.taxes.ISS;
import me.boaviagem.giovane.lab.taxes.Tax;

//@SpringBootApplication
public class LabApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LabApplication.class, args);

		/*
		 * Decorator
		 * 
		 * Por meio de uma classe abstrata, agora podemos compor diversos comportamentos para gerar comportamentos complexos. 
		 * Assim, conseguimos juntar especialidades e regras de negócio que estavam separadas. 
		 * 
		 * Evolução do Strategy.
		 * 
		 */

		Tax iss = new ISS();
		Tax icms = new ICMS();
		Tax iccc = new ICCC();
		Tax icpp = new ICPP();
		Tax ikcv = new IKCV();
		Tax icmsWithIss = new ICMS(iss);

		Budget budget = new Budget(500);

		System.out.println("ISS tax = " + iss.calculate(budget));
		System.out.println("ICMS tax = " + icms.calculate(budget));
		System.out.println("ICCC tax = " + iccc.calculate(budget));
		System.out.println("ICPP tax = " + icpp.calculate(budget));
		System.out.println("IKCV tax = " + ikcv.calculate(budget));
		System.out.println("ICMS with ISS tax = " + icmsWithIss.calculate(budget));
		
		
	}

}
