/*
* Dada una cadena de caracteres, devuelve la cadena invertida
*
* */

import java.util.Scanner;

public class e05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("frase: ");
        String antes = sc.nextLine();
        String despues = alReves(antes);
        System.out.println("Al reves: "+despues);

    }

    static String alReves(String frase) {
        String nueva = "";
        for (int i=0; i<frase.length(); i++)
            nueva=frase.charAt(i)+ nueva; //devuelve el caracter de cada frase y suma nueva
        return nueva;
    }
}
