package it.unica.pr2.attrezzaturaNautica;

import java.util.*;

public class Barca extends HashSet<AttrezzaturaNautica>{
	int direzioneAttuale;

	public Barca() {
		this.direzioneAttuale = 0;
	}
	
	public int direzioneAttuale() {
		int res = 0;
		for(AttrezzaturaNautica t : this) {
			res = t.dir();
		}
		return res;
	}
	
	public void setTimone(Timone t) {
		this.clear();
		this.add(t);
	}
	
	
}
