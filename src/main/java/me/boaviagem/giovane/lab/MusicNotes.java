package me.boaviagem.giovane.lab;

import java.util.HashMap;
import java.util.Map;

import me.boaviagem.giovane.lab.music.Do;
import me.boaviagem.giovane.lab.music.Fa;
import me.boaviagem.giovane.lab.music.INote;
import me.boaviagem.giovane.lab.music.La;
import me.boaviagem.giovane.lab.music.Mi;
import me.boaviagem.giovane.lab.music.Re;
import me.boaviagem.giovane.lab.music.Si;
import me.boaviagem.giovane.lab.music.Sol;

public class MusicNotes {
	
	private static Map<String, INote> notes = new HashMap<String, INote>();

	static {
		notes.put("do", new Do());
		notes.put("re", new Re());
		notes.put("mi", new Mi());
		notes.put("fa", new Fa());
		notes.put("sol", new Sol());
		notes.put("la", new La());
		notes.put("si", new Si());
	}

	public INote get(String note){
		return notes.get(note);
	}
}
