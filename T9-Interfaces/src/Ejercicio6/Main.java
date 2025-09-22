package Ejercicio6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Socio[] tSocios = new Socio[5];

        tSocios[0]= new Socio(1, "PEPE", "07-12-1992");
        tSocios[1]= new Socio(8, "ANTONI", "05-12-1975");
        tSocios[2]= new Socio(4, "LUIS", "05-10-2005");
        tSocios[3]= new Socio(12, "ENRIQUE", "05-12-1992");
        tSocios[4]= new Socio(3, "ANA", "05-12-1999");

        Arrays.sort(tSocios);//por defecto usa el metodo compare to
        System.out.println(Arrays.toString(tSocios));
    }
}
