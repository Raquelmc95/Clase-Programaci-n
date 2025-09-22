/*
* Dada una tabla t de numeros enteros, construir otras dos tablas con los elementos con valores pares
* e impares de la primera. Las tablas pares e impares deben mostrarse ordenadas.
* */

import java.util.Arrays;

public class e08 {
    public static void main(String[] args) {
        int[] t= {3, 4, 5, 6, 7, 8, 10, 14};
        int[] par = new int[0];
        int[] impar = new int[0];

        for (int n:t){
            if (n%2==0){ //es par
                par = Arrays.copyOf(par, par.length+1);
                par[par.length-1] = n;
            }else { //es impar
                impar = Arrays.copyOf(impar, impar.length+1);
                impar[impar.length-1] = n;
            }
        }
        Arrays.sort(par);
        Arrays.sort(impar);
        System.out.print(Arrays.toString(par));
        System.out.print(Arrays.toString(impar));

    }
}
