package me.boaviagem.giovane.lab;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LabApplication {

	public static void main(String[] args) throws SQLException {
		//SpringApplication.run(LabApplication.class, args);

		/* 
		 * Factory
		 * 
		 * Utilizado quando precisamos encapsular trechos de código que são utilizados amplamente pela aplicação, 
		 * e que não possuem nenhuma mudança entre as chamadas. Normalmente a factory é uma classe que possui métodos 
		 * que retornam interfaces, e essas interfaces é que são expostas para o restante do código. Com isso, caso 
		 * precise de mudança, somente uma pequena parte do código é alterada, e esta alteração é automaticamente 
		 * refletida para todo o sistema.
		 * 
		 * A principal diferença de uma factory para um builder é que o builder também abstrai a criação de objetos, 
		 * mas os parâmetros desses objetos mudam com uma certa frequência. Portanto, a factory é utilizada para criar objetos 
		 * que não mudam na aplicação, enquanto o builder, cria objetos que mudam na aplicação.
		 * 
		 */

		 //...

		 Connection c = new ConnectionFactory().getConnection();

		 c.prepareStatement("select * from table...");

		 // ...

		

	}

}
