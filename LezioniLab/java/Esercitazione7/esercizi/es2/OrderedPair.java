package esercizi.es2;

import esercizi.es2.*;

public class OrderedPair<K, V> implements Pair<K, V> {

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getK() { return this.key; }
    public V getV() { return this.value; }
}