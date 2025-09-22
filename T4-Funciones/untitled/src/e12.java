//Crea la funcion muestraPares(int n) que muestre los primeros n numeros pares

import java.util.Scanner;

public class e12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Teclee un nº: ");
        n = sc.nextInt();

        muestraPares (n);

    }
    static void muestraPares(int num){
        for (int i =0; i<=num; i++){
            System.out.print(i*2+ " ,");

        }
    }
}
