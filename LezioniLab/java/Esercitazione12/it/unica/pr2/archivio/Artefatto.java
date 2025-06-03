package it.unica.pr2.archivio;

import java.util.*;

public class Artefatto extends OggettoMagico {
	Rarita rarita;
	
	String utilizzatore;
	
	public Artefatto(String nome, int livello, Rarita rarita) {
		super(nome, livello);
		
		this.rarita = rarita;
		this.utilizzatore = "nessuno";
	}
	
	public Artefatto(String nome, int livello, Rarita rarita, String utilizzatore) {
		super(nome, livello);
		
		this.rarita = rarita;
		this.utilizzatore = utilizzatore;
	}
	
	public String getRarita() {
		return this.rarita.getNome();
	}
	
	public String getUtilizzatore() {
		return this.utilizzatore;
	}
}
