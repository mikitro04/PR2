package it.unica.pr2.menuPranzo;

import java.util.*;

public class Menu extends ArrayList<Pietanza> {
	
	public Menu() {
		super();
	}
	
	public static Menu pranzo() {
		Menu res = new Menu();
		res.add(new Primo("maccheroni", 12));
		res.add(new Primo("riso", 8));
		res.add(new Secondo("bistecca", 15));
		
		return res;
	}
}
