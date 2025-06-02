package it.unica.pr2.risorseWeb;

import java.io.*;

public class FileWeb extends File implements RisorsaWeb {
	String contenuto;
	
	public FileWeb(String nome, String contenuto) {
		super(nome);
		this.contenuto = contenuto;
	}
	
	public FileWeb(String nome) {
		super(nome);
	}
	
	@Override
	public String getNome(){
		return getName();
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
		
		FileWeb a = (FileWeb) o;
		if(this.getNome().equals(a.getNome()) && this.getContenut().equals(a.getContenut())) return true;
		return false;
	}
	
	
	//30
	public void salva() {
		try{
			FileWriter f = new FileWriter(this);
			f.write(this.contenuto);
			f.close();
		}
		catch(IOException e) {
			System.err.println(e);
		}
			
	}
	
	public String getContenuto() {
		int i = 0;
		String res = "";
		try{
			FileReader f = new FileReader(this);
			while(i != -1) {
				i = f.read();
				if(i != -1) {
					res += i;
				}
			}
		}catch(IOException e) {
			System.err.println(e);
		}
			return res;
		
	}
}
