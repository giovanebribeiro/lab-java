package me.boaviagem.giovane.lab;


//@SpringBootApplication
public class LabApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LabApplication.class, args);

		/* 
		 * Builder
		 * 
		 * Padrão de projeto que visa simplificar a criação de objetos complexos. 
		 * Toda a criação da classe Invoice está simplificada por meio de uma segunda classe responsável apenas por criar a classe complexa.
		 *  
		 * Recursos como method chaining e interfaces fluentes são úteis quando queremos deixar nosso código mais limpo e de melhor entendimento.
		 */

		InvoiceBuilder builder = new InvoiceBuilder()
		.fromCompany("company")
		.withCnpj("cnpj")
		.addItem(new Item("item1", 200))
		.addItem(new Item("item2", 300))
		.addItem(new Item("item3", 400))
		.withObservations("obs")
		.atNow();

		Invoice inv = builder.build();

		System.out.println("Total value for invoice: " + inv.getTotal());

	}

}
