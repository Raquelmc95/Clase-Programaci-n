package Boletin12;


import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Lista l = new Lista();
        l.insertaFinal("Pepe");
        l.insertaFinal("Luis");
        l.insertaFinal("Carlos");
        l.insertaFinal("Enrique");
        l.insertaFinal("Manuel");
        l.insertaFinal(new Socio(1, "PEPE", "07-12-1992"));
        l.insertaFinal(new Socio(2, "MANUEL", "07-12-1992"));

        //l.ordenar();
        //System.out.println(l);

        Comparator c1 = new ComparaNombre();
        l.ordenar(c1); //No podrá comparar porque los objetos de la lista son de distintos tipos


    }
}
class ComparaNombre implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Socio s1 = (Socio) o1;
        Socio s2 = (Socio) o2;

        return s1.nombre.compareTo(s2.nombre);
    }
}
