package me.boaviagem.giovane.lab;

import me.boaviagem.giovane.lab.discounts.Discount;
import me.boaviagem.giovane.lab.discounts.DiscountIfValueMore500;
import me.boaviagem.giovane.lab.discounts.DiscountPer5Itens;
import me.boaviagem.giovane.lab.discounts.DiscountPerCombinedItens;
import me.boaviagem.giovane.lab.discounts.NoDiscount;

//@SpringBootApplication
public class LabApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LabApplication.class, args);

		/*
		 * Chain of responsability
		 * 
		 * Indicado quando várias regras de negócio precisam ser escolhidas de acordo com regras específicas e que uma regra deve chamar a outra 
		 * em caso de falha.
		 * 
		 * OBS: Deve ser implementada uma regra que finalize a cadeia, ou alguma lógica que indique quando a cadeia termina.
		 */

		Budget budget = new Budget(500);
		budget.addItem(new Item("item1", 10));
		budget.addItem(new Item("LAPIS", 20));
		budget.addItem(new Item("CANETA", 30));

		Discount d1 = new DiscountIfValueMore500();
		Discount d2 = new DiscountPer5Itens();
		Discount d3 = new DiscountPerCombinedItens();
		Discount d4 = new NoDiscount();

		d1.setNext(d2);
		d2.setNext(d3);
		d3.setNext(d4);

		System.out.println("The discount is: " + d1.calculate(budget)); // calculate the first discount but not the second (condition not satisfied)


	}

}
