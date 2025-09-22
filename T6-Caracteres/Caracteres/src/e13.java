/*
* Crea un algoritmo que lea del teclado una frase e indique, para cada letra, las veces que aparece en la
* frase. Se considera iguales mayusculas y minisculas.
*
* Ejemplo: En un lugar de la mancha
* a: 4 veces
* c: 1 vez
* d: 1 vez
* e: 2 veces
* array de todas las letras que es a-z y contador que cuando este en ese array se sume 1 al contador
* */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class e13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe una frase:");
        String frase = sc.nextLine();
        frase=frase.toLowerCase();

        int [] tabla = new int['z'-'a'+1];

        for (int i=0; i<frase.length(); i++){
            if (Character.isLetter(frase.charAt(i))) {
                tabla[frase.charAt(i) - 'a']++;
            }
        }
        //mostramos de la tabla solo las letras que aparecen en frase
        for (int i=0; i< tabla.length; i++){
            if (tabla[i]!=0) System.out.println((char)(i+'a')+": "+tabla[i]+" veces");
        }
    }
}
