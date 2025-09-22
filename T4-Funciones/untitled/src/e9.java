//Repetir la e4 con una version que calcule el maximo de 3 numeros

import java.util.Scanner;

public class e9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclee el primer nº: ");
        int n1 = sc.nextInt();
        System.out.println("Teclee el segundo nº: ");
        int n2 = sc.nextInt();
        System.out.println("Teclee el segundo nº: ");
        int n3 = sc.nextInt();


        System.out.println("El mayor es "+maximo(n1,n2,n3));


    }

    static int maximo(int n1, int n2) {
        int max;
        if (n1 > n2) max = n1;
        else max = n2;
        return max;
    }

    static int maximo(int n1, int n2, int n3) {
        int aux = maximo(n1, n2);
        return maximo(aux, n3);
    }

    }

