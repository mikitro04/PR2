package it.unica.pr2.imbarcazioniVarie;

import java.util.List;

public interface Vela {
	public static boolean aVela(Imbarcazione i) {
		return i instanceof Vela;
	}
}
