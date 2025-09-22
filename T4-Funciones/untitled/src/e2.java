//Escribe una funcion que se le pasan 2 enteros y muestra los numeros
// comprendidos entre ellos

import java.util.Scanner;

public class e2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Teclee n1: ");
        int n1 = sc.nextInt();
        System.out.print("Teclee n2: ");
        int n2 = sc.nextInt();

        mostrar(n1, n2);
    }

    static void mostrar(int a, int b) {
        int mayor = a > b ? a : b;
        int menor = a < b ? a : b;
        for (int i = menor; i<=mayor; i++) System.out.print(i+" ");

    }
}
