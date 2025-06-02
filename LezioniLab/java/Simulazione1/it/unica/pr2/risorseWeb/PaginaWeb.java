package it.unica.pr2.risorseWeb;

public class PaginaWeb implements RisorsaWeb {
	String nome;
	String contenuto;
	
	public PaginaWeb(String nome, String contenuto) {
		this.nome = nome;
		this.contenuto = contenuto;
	}
	
	@Override
	public String getNome(){
		return this.nome;
	}
	
	@Override
	public String getContenut(){
		return this.contenuto;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		if(o == this) return true;
		if(!(o instanceof RisorsaWeb)) return false;
		
		PaginaWeb a = (PaginaWeb) o;
		if(this.getNome().equals(a.getNome()) && this.getContenut().equals(a.getContenut())) return true;
		return false;
	}
}
