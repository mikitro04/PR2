package it.unica.pr2.zelando;

public abstract class ProdottoDonna implements Prodotto {
	// taglia, colore/descrizione, prezzo
	String descrizione;
	double prezzo;
	
	public ProdottoDonna(String descrizione, double prezzo) {
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}
	
	@Override
	public String descrizione () {
		return this.descrizione;
	}
	
	@Override
	public double prezzo () {
		return this.prezzo;
	}
}
