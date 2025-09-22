//Realiza un programa que convierta un nº decimal en su representacion binaria.

import java.util.Scanner;

public class e20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, n1;

        System.out.print("Teclee un nº: ");
        n = sc.nextInt();

        while (n!=0){
            n1=n%2;
            System.out.println(n1);
            n=n/2;

        }

    }
}
