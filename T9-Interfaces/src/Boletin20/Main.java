package Boletin20;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        barajas b1 = new barajas(2, "basto");
        barajas.dameCarta();

        barajas [] tabla = {
                new barajas(6,"espada"),
                new barajas(5,"basto"),
                new barajas(2,"oro")
        };

        Arrays.sort(tabla);
        System.out.println(Arrays.deepToString(tabla));

        comparaNumeros c = new comparaNumeros();
        Arrays.sort(tabla,c);
        System.out.println(Arrays.deepToString(tabla));

        comparaPalos c2 = new comparaPalos();
        Arrays.sort(tabla,c2);
        System.out.println(Arrays.deepToString(tabla));

    }
}
class comparaNumeros implements Comparator {
        @Override
        public int compare(Object o1, Object o2){
            barajas b1 = (barajas) o1;
            barajas b2 = (barajas) o2;

            return b1.numero-b2.numero;

        }
}
class comparaPalos implements Comparator {
    @Override
    public int compare(Object o1, Object o2){
        barajas b1 = (barajas) o1;
        barajas b2 = (barajas) o2;

        return b1.palo.compareTo(b2.palo);

    }
}

