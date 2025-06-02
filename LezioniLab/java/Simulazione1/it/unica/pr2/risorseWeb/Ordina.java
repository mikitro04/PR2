package it.unica.pr2.risorseWeb;

import java.util.*;
import java.util.stream.Collectors;

public class Ordina {
	public static List<RisorsaWeb> perCriterioUtente(Collection<RisorsaWeb> set, Comparator<RisorsaWeb> comparator) {
		List<RisorsaWeb> res = set.stream()
			.sorted(comparator)
			.collect(Collectors.toList());
		return res;
	}
	
	public static List<RisorsaWeb> perLunghezzaContenuto(Collection<RisorsaWeb> set) {
		List<RisorsaWeb> res = set.stream()
			.sorted(new Comparator<RisorsaWeb>() {
		            public int compare(RisorsaWeb a, RisorsaWeb b) {
		                return a.getContenut().length() - b.getContenut().length();
		            }
		        })
			.collect(Collectors.toList());
		return res;
		
	}
}
