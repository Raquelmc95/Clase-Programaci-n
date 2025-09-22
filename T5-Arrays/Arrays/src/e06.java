/*
* Crea una funcion a la que se le pasan dos tablas, la primera con los 6 numeros de la primitiva, y la
* segunda (ordenada con la combinación ganadora) la funcion devuelve el numero de aciertos
* */

import java.util.Arrays;

public class e06 {
    public static void main(String[] args) {
        int apuesta[] = {4, 23, 99, 12, 13, 15};
        int combinacionGanadora[] = {4, 12, 13, 15, 23, 98};
        System.out.println("Numeros de aciertos: "+primitiva(apuesta, combinacionGanadora));

    }

    static int primitiva(int[] apuesta, int[] combinacionGanadora) {
        int aciertos =0;

        for (int a: apuesta){
            if (Arrays.binarySearch(combinacionGanadora,a)>=0) aciertos++;
            //binarysearch devuelve el indice del elemento buscado, si esta
            // contenido en la tabla, si no esta en la tabla devuelve (- (punto de insercion) -)
            //¿que es punto de insercion? pueden ser dos cosas:
            //1- Es el punto donde se insertaría el elemento
            //2- Si todos los elementos son menores que el buscado, punto de insercion es la longitud de la tabla
        }
        return aciertos;
    }
}
