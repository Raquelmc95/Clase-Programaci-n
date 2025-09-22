/*
* Dadas dos palabras, decir si son anagramas una de la otra.
* Un anagrama es una palabra que resulta de cambiar el orden de los caracteres da otra.
* Ejemplo: amor, roma, mora
* Arrays.sort(tabla de caracter) y la devuelve ordenada.
* */

import java.util.Arrays;

public class e12 {
    public static void main(String[] args) {
        String palabra = "roma";
        String palabra2= "mora";

        char[] letras = palabra.toCharArray();
        System.out.println(Arrays.toString(letras));
        char[] letras2=palabra2.toCharArray();
        System.out.println(Arrays.toString(letras2));

        char[] ordenada = anagrama(letras);
        System.out.println(Arrays.toString(ordenada));
        String cad = String.valueOf(ordenada);

        char[] ordenada2 = anagrama(letras2);
        System.out.println(Arrays.toString(ordenada2));
        String cad2 = String.valueOf(ordenada2);

        if (cad.equalsIgnoreCase(cad2)) {
            System.out.println("Las palabras son anagramas");
        } else {
            System.out.println("Las palabras no son anagramas");
        }

    }

    static char[] anagrama(char[] letras2) {
        Arrays.sort(letras2);
        return letras2;
    }
}


