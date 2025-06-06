package it.unica.pr2.menuPranzo;

import java.util.*;

public class PrezzoNonValido extends RuntimeException {
	public String msg;

	public PrezzoNonValido(String message) {
		super(message);
		msg = message;
	}
}
