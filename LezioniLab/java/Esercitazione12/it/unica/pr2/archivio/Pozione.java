package it.unica.pr2.archivio;

import java.util.*;

public class Pozione extends OggettoMagico {
	String potere;
	StatoOggetto statoOggetto;
	
	public Pozione(String nome, int livello, String potere) {
		super(nome, livello);
		this.potere = potere;
		this.statoOggetto = StatoOggetto.NUOVO;
	}
	
	public String getPotere() {
		return this.potere;
	}
	
	public void setStatusC() {
		this.statoOggetto = StatoOggetto.CONSUMATO;
	}
	
	public StatoOggetto getStatus() {
		return this.statoOggetto;
	}
}
