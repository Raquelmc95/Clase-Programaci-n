package Boletin14;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Lista l=new Lista();
        l.insertaFinal(new Jornada("28451874", "21-01-2000",15,15,20,15));
        l.insertaFinal(new Jornada("21451874", "20-03-2000",16,15,20,15));
        l.insertaFinal(new Jornada("21451874", "23-03-2000",16,15,20,15));
        l.insertaFinal(new Jornada("21451874", "30-03-2000",16,15,20,15));
        l.insertaFinal(new Jornada("23451874", "19-04-2000",12,15,20,15));
        l.insertaFinal(new Jornada("26441874", "21-01-2000",15,15,20,15));
        l.insertaFinal(new Jornada("27451874", "23-01-2000",14,15,20,15));

        //System.out.println(l);
        //Arrays.sort(l.tabla);
        //System.out.println(l);

        comparaJornadas c1 = new comparaJornadas();
        l.ordenar(c1);
        System.out.println(l);

    }
}
class comparaJornadas implements Comparator{
    @Override
    public int compare(Object o1, Object o2){
        Jornada j1 = (Jornada) o1;
        Jornada j2 = (Jornada) o2;

        return j1.minutosTrabajados()-j2.minutosTrabajados();

    }

}
