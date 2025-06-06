package it.unica.pr2.attrezzaturaNautica;

import java.util.*;

public class Timone implements AttrezzaturaNautica {
	int dir;
	public static int totaleTimoni = 0;
	int direzioniCambiate = 0;

	public Timone(int dir) {
		this.dir = dir;
		totaleTimoni++;
		direzioniCambiate++;
	}
	
	public int dir() {
		return this.dir;
	}
	
	public void imposta(int dir) {
		if(dir < 0) {
			throw new DirezioneNonValidaException("Direzione " + dir + " non valida. La direzione deve essere un valore nell'intervallo [0,360]");
		}
		this.dir = dir;
		direzioniCambiate++;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		if(o == this) return true;
		if(!(o.getClass().equals(getClass()))) return false;
		
		Timone a = (Timone) o;
		return a.dir() == this.dir();
	}
	
	@Override
	public String toString() {
		//return "" + dir();
		//0=NORD; 90=EST; 180=SUD; 270=OVEST
		switch (this.dir) {
			case 0: return "" + dir() + " NORD";
			case 90: return "" + dir() + " EST";
			case 180: return "" + dir() + " SUD";
			case 270: return "" + dir() + " OVEST";
			default: return "" + dir();
		}
	}
}
