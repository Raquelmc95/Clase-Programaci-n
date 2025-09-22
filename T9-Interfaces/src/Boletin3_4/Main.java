package Boletin3_4;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Futbolista[] tf=new Futbolista[5];
        tf[0]=new Futbolista("27455099","Pedro", 25, 0);
        tf[1]=new Futbolista("26455099","Enrique", 23, 5);
        tf[2]=new Futbolista("17455099","Manuel", 23, 10);
        tf[3]=new Futbolista("27454099","Luis", 30, 6);
        tf[4]=new Futbolista("25455099","Carlos", 24, 10);

        Arrays.sort(tf);
        System.out.println(Arrays.toString(tf));

        Comparator c1 = new ComparaEdades();
        Arrays.sort(tf,c1);
        System.out.println(Arrays.deepToString(tf));

        Comparator c2 = new ComparaNombre();
        Arrays.sort(tf,c2);
        System.out.println(Arrays.deepToString(tf));

        Comparator c3 = new ComparaNombre();
        Arrays.sort(tf,c3);
        System.out.println(Arrays.deepToString(tf));

    }
}
class ComparaEdades implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Futbolista f1 = (Futbolista) o1;
        Futbolista f2 = (Futbolista) o2;
        return f1.edad -f2.edad;
    }
}
class ComparaNombre implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Futbolista f1 = (Futbolista) o1;
        Futbolista f2 = (Futbolista) o2;

        return f1.nombre.compareTo(f2.nombre);
    }
}
class Ejercicio4 implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Futbolista f1 = (Futbolista) o1;
        Futbolista f2 = (Futbolista) o2;
        int res;
        if (f1.edad - f2.edad==0){
            res=f1.nombre.compareTo(f2.nombre);
        }else {
            res=f1.edad-f2.edad;
        }

        return res;
    }
}
