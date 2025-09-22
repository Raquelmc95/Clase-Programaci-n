/*
* Escribir la funcion int[] rellenaPares(int longitud, int fin), que crea y devuelve una tabla ordenada
* de la longitud especificada como parametro  que se encuentra rellena con numeros pares aleatorios comprendidos
* en el rango desde 2 hasta "fin" (inclusive).
* */

import java.util.Arrays;

public class e05 {
    public static void main(String[] args) {

        System.out.print(Arrays.toString(rellenaPares(20, 128)));

    }

    static int[] rellenaPares(int longitud, int fin) {
        int pares[] = new int[longitud];
        int cont =0;
        while (cont<pares.length){
            int aleatorio = (int) (Math.random()*fin+1);
            if (aleatorio%2==0) {
                pares[cont] = aleatorio;
                cont++;
            }

        }
        Arrays.sort(pares); //para ordenar los valores de pares que son los numeros ale
        return pares;


    }
}
