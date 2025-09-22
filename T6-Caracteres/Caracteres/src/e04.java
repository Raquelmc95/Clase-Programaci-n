/*
* Dada una frase, indica cuantos espacios en blanco tiene.
* */

import java.util.Scanner;

public class e04 {
    public static void main(String[] args) {
        char c;
        int numEspacios=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("frase: ");
        String frase = sc.nextLine();

        for (int i=0; i<frase.length(); i++){
            c=frase.charAt(i); //devuelve el caracter de cada frase
            if (Character.isSpaceChar(c)) numEspacios++; //Character te devuelve true cuando c es un espacio en blanco y lo sumamos a numEspacios
        }
        System.out.println("Numero de espacios: "+numEspacios);
    }
}
