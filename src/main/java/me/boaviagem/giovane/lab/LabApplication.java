package me.boaviagem.giovane.lab;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import me.boaviagem.giovane.lab.music.INote;
import me.boaviagem.giovane.lab.music.MusicNotes;

@SpringBootApplication
public class LabApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LabApplication.class, args);

		/**
		 * FLYWEIGHT
		 * 
		 * Às vezes, precisamos criar várias instâncias de uma mesma classe. 
		 * O problema é que se elas são essencialmente iguais, podemos instanciar 
		 * esta classe de maneira estática, e utilizá-la repetidamente (exemplo da classe Fa). Assim,
		 * ecomomizamos memória e diminuimos os pontos de manutenção.
		 */

		MusicNotes notes = new MusicNotes();

		List<INote> music = Arrays.asList(
			notes.get("do"),
			notes.get("re"),
			notes.get("mi"),
			notes.get("fa"),
			notes.get("fa"),
			notes.get("fa"),
			notes.get("fa")
		);

		new Piano().play(music);
	}

}
