package it.unica.pr2.pair;

import it.unica.pr2.pair.*;

public class TestPair {
    public static void main(String[] args) {

        Pair<String, Boolean> myPair = new OrderedPair<>(new String("bello"), true);
        Pair<String, Boolean> myPair2 = new OrderedPair<>("insignificante", false);
        Pair<String, String> myPair3 = new OrderedPair<>("ciao", "hello");
        OrderedPair<String, Boolean> myPair4 = new OrderedPair<>("bello", true);

        assert myPair.getFirst().equals( new String("be"+"l"+"lo") );
        
        assert myPair.getSecond();
        
        assert !myPair.getSecond().equals(myPair2.getSecond());
        
        assert myPair.getFirst().equals(myPair4.getFirst());
        
        assert myPair.getSecond().equals(myPair4.getSecond());
        
        
        
        SameTypePair<String> pairS = new SameTypePair<>("ciao","hello");
        Pair<String,String> samePair = new SameTypePair<>("hello","ciao");

        assert pairS.getFirst().equals(samePair.getSecond());
        
        
        UnorderedPair<String, Integer> c1 = new UnorderedPair<>("ciao",20);
        UnorderedPair<String, Integer> c2 = new UnorderedPair<>("ciao",20);
        UnorderedPair<Integer, String> c3 = new UnorderedPair<>(20,"ciao");
        UnorderedPair<Integer, Integer> c4 = new UnorderedPair<>(20,20);

        assert c1.equals(c2);
        
        assert c1.equals(c3);
        
        assert c1.getFirst().equals(c3.getSecond());
        
        assert !c1.equals(c4);
        /**/
    }

}
