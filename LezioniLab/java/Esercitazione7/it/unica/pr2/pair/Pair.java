package it.unica.pr2.pair;

public class Pair<K, V> {
    private K first;
    private V second;

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() { return this.first; }
    public V getSecond() { return this.second; }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null) return false;
        if(o.getClass() != getClass()) return false;

        Pair v = (Pair) o;
        return (this.first.equals(v.getFirst()) && this.second.equals(v.getSecond()));
    }
}