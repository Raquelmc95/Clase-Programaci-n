//Crear un programa que pida por teclado un nº entero n de mas de una cifra y verifique si es capicúa.
//un numero es capicua si se puede leer igual de izq a derecha que de derecha a izq. Ej: 121, 3003, 1234321,
//33, 445544,

import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, aux, inverso=0, cifra;

        do{
            System.out.print("Introduce nº mayor igual que 10: ");
            n= sc.nextInt();
        }while (n<10);

        //Le doy la vuelta al numero

        aux=n;
        while (aux!=0){
            cifra = aux%10;
            inverso = inverso*10 + cifra;
            aux = aux/10;
        }
        if (n==inverso) System.out.print("Es capicua");
        else System.out.print("No es capicua");

    }
}
