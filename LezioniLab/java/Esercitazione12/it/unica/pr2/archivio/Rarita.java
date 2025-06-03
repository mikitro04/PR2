package it.unica.pr2.archivio;

import java.util.*;

public enum Rarita {
	RARO("raro"),
	LEGGENDARIO("leggendario");
	
	private String nome;
	
	Rarita(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
}
