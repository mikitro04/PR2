package it.unica.pr2.zelando;

import java.util.*;
import java.util.stream.Collectors.*;
import java.util.stream.*;

public class Carrello extends ArrayList<Prodotto> {

	public Carrello() {
		super();
	}
	
	public Carrello(Prodotto[] l) {
		for(Prodotto p : l) {
			this.add(p);
		}
	}
	
	public double costo() {
		double res = 0;
		
		for(Prodotto p : this) {
			res += p.prezzo();
		}
		
		return res;
	}
	
	public int nProdottiDonna() {
		int c = 0;
		
		for(Prodotto p : this) {
			if(p instanceof ProdottoDonna) c++;
		}
		
		return c;
	}
	
	public int nProdottiUomo() {
		int c = 0;
		
		for(Prodotto p : this) {
			if(p instanceof ProdottoUomo) c++;
		}
		
		return c;
	}
	
	public int nProdotti() {
		return this.size();
	}
	
	public List<ProdottoDonna> prodottiDonna() {
		return this.stream()
			   .filter(x -> x instanceof ProdottoDonna)
			   .map(x -> (ProdottoDonna) x)
			   .collect(Collectors.toList());
	}
	
	public static Carrello fromList(List<? extends Prodotto> l) {
		Carrello c = new Carrello();

		c.addAll(l);
		
		return c;
	}
	
	public Carrello nProdotti(String nome) {
	    String[] parole = nome.split(" ");

	    return this.stream()
			.filter(p -> Arrays.stream(parole)
					   .allMatch(p.descrizione()::contains))
			.collect(Collectors.toList());
	}
}
