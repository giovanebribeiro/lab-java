package me.boaviagem.giovane.lab;

import me.boaviagem.giovane.lab.budget.Budget;

//@SpringBootApplication
public class LabApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LabApplication.class, args);

		/*
		 * State
		 * 
		 * Utilizado quando temos ações que variam de acordo com estados da classe. É literalmente a implementação de uma máquina de estados.
		 * Só precisamos ter o cuidado de transicionar corretamente os estados e cuidar para que a classe principal (no caso, budget), tenha 
		 * métodos de controle corretos e que possam ser repassados para as camadas superiores
		 * 
		 */
		Budget budget = new Budget(500);

		budget.applyExtraDiscount();

		System.out.println("Extra discount applied: " + budget.getValue());

		budget.approve();
		budget.applyExtraDiscount();

		System.out.println("After approve, extra discount: " + budget.getValue());

		budget.finalize();
		budget.applyExtraDiscount(); // should throw an exception here

	}

}
