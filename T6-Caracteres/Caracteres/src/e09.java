/*
* Pedir por teclado una frase palabra a palabra y mostrar la frase completa introduciendo espacios entre
* palabras. Se termina la frase cuando se escribe "fin".
* */

import java.util.Scanner;

public class e09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = "", palabra;
        System.out.print("Palabra: ");
        palabra = sc.next(); //no me valen los espacios por eso quito line y con next solo me lee una palabra no una frase
        while (!palabra.equals("fin")){
            frase = frase + " "+ palabra;

            System.out.print("Palabra: ");
            palabra = sc.next();
        }
        System.out.println("Frase: "+frase);



    }
}
