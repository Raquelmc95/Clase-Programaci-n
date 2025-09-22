/*
* Crea una funcion int[] sinRepetidos(int t[]), que crea y devuelve una tabla de la longitud apropiada,
* con los elementos de t, donde se han eliminado los repetidos.
* */

import java.util.Arrays;

public class e07 {
    public static void main(String[] args) {
        int t[] = {2,3,2,6,3};
        System.out.println(Arrays.toString(sinRepetidos(t)));

    }

    static int[] sinRepetidos(int[] t) {
        int tsinrepetidos [] = new int[0];

        for (int elementos: t){
            if (buscar(tsinrepetidos, elementos)==-1){ //si no esta, lo insertamos
                //algoritmo de insercion
                tsinrepetidos = Arrays.copyOf(tsinrepetidos, tsinrepetidos.length+1);
                tsinrepetidos[tsinrepetidos.length-1] = elementos; //lo añadimos al final
            }

        }
        return tsinrepetidos;
    }

    static int buscar(int[] t, int elementos) {
        boolean encontrado = false;
        int pos = -1;
        int i=0;
        while (i< t.length && !encontrado){
            if (t[i]==elementos){
                pos = i;
                encontrado = true;
            }
            i++;
        }
        return pos;
    }
}
