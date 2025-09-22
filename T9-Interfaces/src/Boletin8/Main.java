package Boletin8;


import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Socio[] tSocios = new Socio[5];

        tSocios[0]= new Socio(1, "PEPE", "07-12-1992");
        tSocios[1]= new Socio(8, "ANTONI", "05-12-1975");
        tSocios[2]= new Socio(4, "LUIS", "05-10-1995");
        tSocios[3]= new Socio(12, "ENRIQUE", "05-12-2000");
        tSocios[4]= new Socio(3, "ANA", "05-12-1999");

        Arrays.sort(tSocios);//por defecto usa el metodo compare to
        System.out.println(Arrays.toString(tSocios));
        Arrays.sort(tSocios);
        System.out.println(Arrays.toString(tSocios));

        ComparaNombre c1 = new ComparaNombre();
        Arrays.sort(tSocios,c1);
        System.out.println(Arrays.deepToString(tSocios));
    }
}
class ComparaNombre implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Socio f1 = (Socio) o1;
        Socio f2 = (Socio) o2;

        return f1.nombre.compareTo(f2.nombre);
    }
}
