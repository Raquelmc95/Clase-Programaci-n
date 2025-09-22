package Boletin17;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Llamadas ll1 = new Llamadas("622929801", "652123015", true, 18,20,18,40,"07-02-2025", Zona.Zona4);
        Llamadas ll2 = new Llamadas("622929801", "652123015", true, 18,20,18,40,"07-02-2025", Zona.Zona4);

        System.out.println("Minutos de la llamada: "+ll1.minutosLlamadas());
        System.out.println("Coste: "+ll1.coste());
        System.out.println(ll1);

        Llamadas[] tabla= new Llamadas[4];
        tabla[0]= new Llamadas("622929801", "652123015", true, 19,20,19,40,"07-02-2025", Zona.Zona4);
        tabla[1]=new Llamadas("622929801", "630311288", true, 20,20,20,40,"10-01-2025", Zona.Zona0);
        tabla[2]=new Llamadas("662205883", "677353235", true, 13,20,14,40,"18-03-2025", Zona.Zona1);
        tabla[3]=new Llamadas("610300705", "954747372", true, 11,20,12,40,"18-02-2025", Zona.Zona3);

        Arrays.sort(tabla);
        System.out.println(Arrays.toString(tabla));

        comparaCoste c = new comparaCoste();
        Arrays.sort(tabla, c);
        System.out.println(Arrays.deepToString(tabla));


    }
}
class comparaCoste implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Llamadas l1 = (Llamadas) o1;
        Llamadas l2 = (Llamadas) o2;
        int resultado= l1.coste()- l2.coste();

        return resultado;
    }
}
