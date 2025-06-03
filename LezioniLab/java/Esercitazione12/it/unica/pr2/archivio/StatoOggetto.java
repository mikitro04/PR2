package it.unica.pr2.archivio;

import java.util.*;

public enum StatoOggetto {
	NUOVO("Nuovo"),
	CONSUMATO("Consumato");
	
	private String nome;
	
	StatoOggetto(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
}
