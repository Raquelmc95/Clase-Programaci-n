//Crea la funcion eco() que se le pasa como parametro un numero n y muestra
// n veces el mensaje "eco...."

import java.util.Scanner;

public class e1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Teclee n: ");
        int n = sc.nextInt();

        eco(n, n+1);

    }

    static void eco(int a, int b) {
        for (int i=0; i<=a; i++) System.out.println("eco.....");
        System.out.println();
        for (int i=0; i<=b; i++) System.out.println("eco.....");
    }
}
