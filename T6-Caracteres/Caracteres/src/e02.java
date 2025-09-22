/*
* Dada dos frases, indica cual de ellas es la mas corta
* */

import java.util.Scanner;

public class e02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primera frase: ");
        String frase1 = sc.nextLine();
        System.out.print("Segunda frase: ");
        String frase2 = sc.nextLine();
        int longfrase1 = frase1.length();
        int longfrase2 = frase2.length();
        if (longfrase1==longfrase2) System.out.print("Las dos frases tienen la misma longitud");
        else if (longfrase2>longfrase1)System.out.print("La primera frase es mas corta que la segunda");
        else System.out.print("La segunda frase es mas corta que la primera");


    }
}
