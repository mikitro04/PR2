package it.unica.pr2.attrezzaturaNautica;

import java.util.*;

public class DirezioneNonValidaException extends RuntimeException {
	public DirezioneNonValidaException(String message) {
		super(message);
	}
	
	public String stampaCausa() {
		return this.getMessage();
	}
}
