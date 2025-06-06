package it.unica.pr2.zelando;

import java.util.*;

public class Gonna extends ProdottoDonna {
	String taglia;
	
	public Gonna(String taglia, String descrizione, double prezzo) {
		super(descrizione, prezzo);	
		
		this.taglia = taglia;
	}
	
	public String taglia () {
		return this.taglia;
	}
}
