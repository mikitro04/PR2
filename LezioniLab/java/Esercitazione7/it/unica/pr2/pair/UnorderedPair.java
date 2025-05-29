package it.unica.pr2.pair;

import it.unica.pr2.pair.*;

public class UnorderedPair<T, U> extends Pair<T, U> {
    public UnorderedPair(T first, U second) {
        super(first, second);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null) return false;
        if(o.getClass() != getClass()) return false;

        UnorderedPair v = (UnorderedPair) o;
        
        /*return (this.getFirst().equals(v.getFirst()) || this.getSecond().equals(v.getFirst())) && 
            (this.getFirst().equals(v.getSecond()) || this.getSecond().equals(v.getSecond()));*/

        if(this.getFirst().equals(v.getFirst()) || this.getSecond().equals(v.getFirst())) {
            if(this.getFirst().equals(v.getFirst())) {
                return (this.getSecond().equals(v.getSecond()));
            }
            else {
                return (this.getFirst().equals(v.getSecond()));
            }
        }
        return false;
    }
}