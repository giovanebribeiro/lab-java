package me.boaviagem.giovane.lab;

import java.util.List;

import org.jfugue.player.Player;

import me.boaviagem.giovane.lab.music.INote;

public class Piano {
	
	public void play(List<INote> music){
		Player player = new Player();

		StringBuilder sb = new StringBuilder();
		for(INote note: music){
			sb.append(note.symbol() + " ");
		}

		player.play(sb.toString());
	}
}
