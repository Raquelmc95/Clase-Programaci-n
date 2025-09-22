//Diseñar una funcion recursiva que calcule n-esimo termino de la serie
//de fibonnaci. Se calcula de la siguiente forma:
//fib(n)= fib(n-1) + fib(n-2)
//fib(0)=1
//fib(1)=1

import java.util.Scanner;

public class e11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un numero: ");
        n = sc.nextInt();

        System.out.print("La posicion de " + n+ " en Fibonacci es: "+sucesionFibonacci(n));

    }
    static int sucesionFibonacci(int num){
        int fib;
        if (num == 0) fib = 0;
        else if (num == 1) fib =1;
        else fib = sucesionFibonacci(num-1) + sucesionFibonacci(num-2);

        return (fib);
    }
}
