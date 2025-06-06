package it.unica.pr2.menuPranzo;

import java.util.*;

public abstract class Pietanza implements Comparable<Pietanza> {
	String nome;
	int prezzo;
	
	public Pietanza(String nome, int prezzo) {
		this.nome = nome;
		if(prezzo <= 0) {
			throw new PrezzoNonValido("il prezzo di OGNI PIETANZA non puo essere negativo");
		}
		this.prezzo = prezzo;
	}
	
	public String nome() {
		return this.nome;
	}
	
	public int prezzo() {
		return this.prezzo;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		if(o == this) return true;
		if(!(o.getClass() == getClass())) return false;
		
		Pietanza p = (Pietanza) o;
		return this.nome().equals(p.nome()) && this.prezzo() == p.prezzo();
	}
	
	
	@Override 
	public int compareTo(Pietanza o) {
		int res = Integer.compare(this.prezzo(), o.prezzo());
		if(res == 0) {
			res = this.nome().compareTo(o.nome());
		}
		return res;
	}
}
