package it.unica.pr2.archivio;

import java.util.*;

public abstract class OggettoMagico {
	//nome, livello
	String nome;
	int livello;
	
	public OggettoMagico(String nome, int livello) {
		this.nome = nome;
		this.livello = livello;
	}
	
	public String getNome() { return this.nome; }
	
	public int getLivello() { return this.livello; }
}
