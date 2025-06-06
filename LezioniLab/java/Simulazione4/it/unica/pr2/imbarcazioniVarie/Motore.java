package it.unica.pr2.imbarcazioniVarie;

import java.util.List;

public interface Motore {
	public static boolean aMotore(Imbarcazione i) {
		return i instanceof Motore;
	}
}
