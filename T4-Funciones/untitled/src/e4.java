//Crea una funcion que recibe como parametro dos numeros enteros y devuelve
// el maximo de los dos

import java.util.Scanner;

public class e4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclee el primer nº: ");
        int n1 = sc.nextInt();
        System.out.println("Teclee el segundo nº: ");
        int n2 = sc.nextInt();

        System.out.println("El mayor es "+maximo(n1,n2)); //aqui pasa el valor de max de la funcion como si fuera max=maximo(n1,n2)
        //entonces se sustituye el maximo por el max

    }
// int es el valor que devuelve maximo porque maximo es un valor entero

    static int maximo(int n1, int n2) {
        int max;
        if (n1 > n2) max = n1;
        else max = n2;
        //el return es para que devuelva el valor de return, cuando no tenemos
        //un void hay que poner el return siempre
        return max;
    }
}
