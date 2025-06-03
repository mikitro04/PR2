package it.unica.pr2.counter.core;

import java.util.*;

public class Counter<T> extends HashSet<T> {
	List<T> dup = new ArrayList<>();
	
	public Counter() {
		super();
	}
	
	public Counter(List<T> list) {
		for(T item : list) {
			this.add(item);
		}
	}

	@Override
	public boolean add(T e) {
		if(this.contains(e)) {
			this.dup.add(e);
		}
		return super.add(e);
	}
	
	@Override
	public boolean remove(Object e) {
		if(this.dup.contains(e)) {
			this.dup.remove(e);
		}
		return super.remove(e);
	}
	
	
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		if(o == this) return true;
		if(!(o instanceof Set)) return false;
		
		Set<?> a = (Set<?>) o;
		
		if(a.size() != this.size()) return false;
		
		if(this.containsAll(a)) return true;
		
		return false;
	}
	
	public int count(T thing) {
		int c = 0;
		for(T x : this) {
			if(x.equals(thing)) c++;
		}
		for(T y : this.dup) {
			if(y.equals(thing)) c++;
		}
		return c;
	}
	
	public int count() {
		int c = 0;
		for(T x : this) {
			c++;
		}
		return c + this.dup.size();
	}
}
