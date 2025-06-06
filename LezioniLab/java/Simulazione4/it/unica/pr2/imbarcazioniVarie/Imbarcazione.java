package it.unica.pr2.imbarcazioniVarie;

import java.util.*;
import java.util.stream.*;

public abstract class Imbarcazione {
	public static List<Imbarcazione> lista = new ArrayList<>();
	
	public Imbarcazione() {
		Collections.reverse(lista);
		lista.add(this);
		Collections.reverse(lista);
	}
	
	public static List<Imbarcazione> lista() {
		return lista;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		if(o == this) return true;
		if(o.getClass() == getClass()) return true;
		return false;
	}
}
