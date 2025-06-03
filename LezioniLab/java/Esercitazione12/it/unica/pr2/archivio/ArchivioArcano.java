package it.unica.pr2.archivio;

import java.util.*;
import static java.util.stream.Collectors.toList;

public class ArchivioArcano {
	List<OggettoMagico> oggetti = new ArrayList<>();
	
	public ArchivioArcano() {}
	
	public int numOggetti() {
		return oggetti.size();
	}
	
	public void aggiungi(OggettoMagico o) {
		this.oggetti.add(o);
	}
	
	public List<OggettoMagico> getOggettiMagici() {
		return this.oggetti;
	}
	
	public List<String> oggettiForti(int lvl) {
		return this.oggetti.stream()
				   .filter(x -> x.getLivello() >= lvl)
				   .map(OggettoMagico::getNome)
				   .collect(toList());
	}
	
	public String usaOggetto(String oggetto, String chi) {
		int i = 0;
		OggettoMagico o = oggetti.stream()
					 .filter(x -> x.getNome().equals(oggetto))
				   	 .findFirst()
     					 .orElse(null);
     		if(o != null) {
     			if(o instanceof Pozione) {
     				Pozione p = (Pozione) o;
     				i = this.oggetti.indexOf(o);
     				p.setStatusC();
     				oggetti.set(i, p);
     				return p.getPotere();
     			}else if(o instanceof Artefatto) {
     				Artefatto a = (Artefatto) o;
     				if(a.getUtilizzatore().equals(chi) || a.getUtilizzatore().equals("nessuno")) {
	     				return a.getRarita() + " " + a.getNome();
     				}else {
     					throw new AccessoNegatoException(a.getUtilizzatore());
     				}
     			}
     		}
     		return "";
	}
	
	public StatoOggetto statoOggetto(String nome) {
		OggettoMagico o = oggetti.stream()
					 .filter(x -> x.getNome().equals(nome))
				   	 .findFirst()
     					 .orElse(null);
     					 
     		if(o != null) {
     			if(o instanceof Pozione) {
     				Pozione p = (Pozione) o;
     				return p.getStatus();
     			}
     		}
     		return null;
	}
	
	public List<String> elencoOrdinatoPerLivello() {
		return this.oggetti.stream()
			   .sorted((x, y) -> Integer.compare(x.getLivello(),y.getLivello()))
			   .map(OggettoMagico::getNome)
			   .collect(toList());
	}
}
