/*
* Programar un juego donde dada una palabra, el programa muestra un anagrama (cambio de orden de los caracteres)
* generado al azar.
* Luego el jugador tiene que acetar el texto original. El programa controla que no se introduzca cadena vacia
* al comienzo.
* hacemos un do while donde
* */

import java.util.Arrays;
import java.util.Scanner;

public class e14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;
        do {
            System.out.print("Introduce una palabra: ");
            palabra = sc.next(); //si es solo una palabra es solo una palabra next
            palabra=palabra.toLowerCase();
        }while (palabra.isEmpty());

        String despues = Anagrama(palabra);
        System.out.println(despues);

        String jugador;
        String aburrido="fin";

        do{
            System.out.println("Advina la palabra: ");
            jugador = sc.next();
            System.out.println("Has acertado "+calculaAciertos(palabra,jugador)+" palabras");

        }while (!palabra.equals(jugador) && !jugador.equals(aburrido));

        if (palabra.equals(jugador))System.out.println("Has acertado la palabra");
        else System.out.println("Te has aburrido");


    }

    static String Anagrama(String palabra) {
        char [] tabla = palabra.toCharArray();
        for (int i=0; i<tabla.length; i++){
            int pos=(int)(Math.random()*palabra.length());
            int aux=tabla[pos];
            tabla[pos]=tabla[i];
            tabla[i]=(char)aux;
        }
        return String.valueOf(tabla);
    }
    static int calculaAciertos(String palabra, String jugador) {
        char letra [] = palabra.toCharArray();
        char p [] = jugador.toCharArray();
        int longMin=(palabra.length()>=jugador.length()) ? jugador.length():palabra.length();
        int aciertos =0;
        for (int i=0; i<longMin; i++){
            if (p[i]==letra[i]) aciertos++;
        }
        return aciertos;
        /*
        * for(int i=0; i<longMin; i++)
        * if(palabra.charAt(i)==jugador.charAt(i)))aciertos++
        * */
    }
}
