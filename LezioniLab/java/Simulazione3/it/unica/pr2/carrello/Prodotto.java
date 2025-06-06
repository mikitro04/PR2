package it.unica.pr2.carrello;

import java.util.*;
import java.util.stream.*;

public class Prodotto {
	String nome;
	Double prezzo;
	public static int tot = 0;
	public static List<Prodotto> list = new ArrayList<>();
	
	public Prodotto(String nome, Double prezzo) {
		this.nome = nome;
		this.prezzo = prezzo;
		
		this.tot++;
		list.add(this);
	}
	
	public Prodotto(String nome) {
		this.nome = nome;
		this.prezzo = -1.0;
		
		this.tot++;
	}
	
	public String nome() {
		return this.nome;
	}
	
	public double prezzo() {
		return this.prezzo;
	}
	
	public static int nProdotti() {
		return tot;
	}
	
	public static Set<Prodotto> costaMenoDi(double tot) {
		Set<Prodotto> res = list.stream()
					.filter(p -> p.prezzo() <= tot)
					.collect(Collectors.toSet());
		return res;
	}
}
