package it.unica.pr2.zelando;

import java.util.*;

public class MagliettaUomo extends ProdottoUomo {
	String taglia;
	
	public MagliettaUomo(String taglia, String descrizione, double prezzo) {
		super(descrizione, prezzo);
		
		this.taglia = taglia;
	}
	
	public String taglia () {
		return this.taglia;
	}
}
