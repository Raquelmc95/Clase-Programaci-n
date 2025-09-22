package Boletin1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Lista l = new Lista();
        l.insertaFinal("Cadiz");
        l.insertaFinal("Malaga");
        l.insertaFinal("Sevilla");
        l.insertaFinal("Cordoba");
        l.insertaFinal("Jaen");
        l.insertaFinal("Granada");
        l.insertaFinal("Huelva");
        l.insertaFinal("Almeria");
        System.out.println(l);
        Arrays.sort(l.tabla);//Lo ordena por su orden natural, alfabeticamente
        System.out.println(l);
    }
}
