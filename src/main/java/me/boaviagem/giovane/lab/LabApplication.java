package me.boaviagem.giovane.lab;

import me.boaviagem.giovane.lab.actions.InvoiceDAO;
import me.boaviagem.giovane.lab.actions.Print;
import me.boaviagem.giovane.lab.actions.SendEmail;
import me.boaviagem.giovane.lab.actions.SendSms;

//@SpringBootApplication
public class LabApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LabApplication.class, args);

		/* 
		 * Observer
		 * 
		 * Utilizado quando desejamos executar ações após uma determinada rotina ser executada. 
		 * Quando fazemos isso diretamente na classe, aumentamos o acoplamento desta classe, o que torna o código difícil de manter
		 * 
		 * Assim, podemos quebrar cada ação em uma classe, com um contrato (interface) entre elas. E na classe que vai executar estas ações, 
		 * teremos apenas uma lista destas ações.
		 * 
		 * Deste modo, a classe principal não precisa saber quais ações devem ser executadas. Somente que existem ações a serem executadas.
		 * Reduzimos o acoplamento, e tornamos nosso código mais legível e de melhor manutenção.
		 * 
		 */

		InvoiceBuilder builder = new InvoiceBuilder()
		.fromCompany("company")
		.withCnpj("cnpj")
		.addItem(new Item("item1", 200))
		.addItem(new Item("item2", 300))
		.addItem(new Item("item3", 400))
		.withObservations("obs")
		.atNow();

		builder.addAction(new InvoiceDAO());
		builder.addAction(new Print());
		builder.addAction(new SendEmail());
		builder.addAction(new SendSms());

		Invoice inv = builder.build();



		System.out.println("Total value for invoice: " + inv.getTotal());

	}

}
