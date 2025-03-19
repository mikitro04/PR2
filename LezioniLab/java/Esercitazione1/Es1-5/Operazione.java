public class Operazione {
    int valore1;
    int valore2;

    public Operazione(int a, int b){
        valore1 = a;
        valore2 = b;
    }

    int somma(){
        return valore1 + valore2;
    }

    int sottrazione(){
        return valore1 - valore2;
    }

    int moltiplicazione(){
        return valore1 * valore2;
    }

    int divisione(){
        return valore1 / valore2;
    }

}
