package it.unica.pr2.carrello;

import java.util.*;

public class Carrello extends HashMap<Prodotto, Double> {
	
	public Carrello() {
		super();
	}
	
	public void aggiungi(Prodotto p, Double q) {
		if(p.prezzo() == -1.0) {
			throw new PrezzoSconosciutoException("prezzo sconosciuto");
		}
		this.put(p, q);
	}
	
	public double costo() {
		double res = 0;
		
		for(Prodotto p : this.keySet()) {
			res += (p.prezzo() * this.get(p));
		}
		
		return res;
	}
}
