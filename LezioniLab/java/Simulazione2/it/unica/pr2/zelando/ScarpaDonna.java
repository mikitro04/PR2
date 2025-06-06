package it.unica.pr2.zelando;

import java.util.*;

public class ScarpaDonna extends ProdottoDonna {
	int taglia;
	
	public ScarpaDonna(int taglia, String descrizione, double prezzo) {
		super(descrizione, prezzo);
		
		this.taglia = taglia;
	}
	
	public int taglia () {
		return this.taglia;
	}
}
