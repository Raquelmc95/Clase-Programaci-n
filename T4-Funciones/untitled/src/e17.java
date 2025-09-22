//Teclear un nº n. Escribir una funcion void cuadrado (n) que imprime en la consola
//un cuadrado con n asteriscos por lado ej: n5 *****

import java.util.Scanner;

public class e17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Teclee un nº: ");
        n = sc.nextInt();

        cuadrado(n);

    }
    static void cuadrado(int num) {
        for (int i = 1; i<=num; i++) {
            for (int j = 1; j<=num; j++) {
                if (i == num/2 || j == 1|| j == num) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
