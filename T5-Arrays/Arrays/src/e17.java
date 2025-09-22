/*
* Modifica el ejercicio anterior para que la funcion no altere la tabla que se pasa como parametro  y en su lugar
* devuelva otra tabla con los elementos desordenados.
* */

import java.util.Arrays;

public class e17 {
    public static void main(String[] args) {
        int[] t={2,4,6,8,10};

        desordenar(t);

    }

    static void desordenar(int[] t) {
        int copia [] = Arrays.copyOf(t, t.length);
        int t1 [] = new int[0];
        while (copia.length>0) {
            int iAzar = (int) (Math.random() * copia.length);
            int n = copia[iAzar];
            copia = borrar(copia, n);
            t1 = insercionNoOrdenada(t1, n);

        }
        System.out.println(Arrays.toString(t));
        System.out.println(Arrays.toString(copia));
        System.out.println(Arrays.toString(t1));
    }

    static int[] borrar(int[] copia, int n) {
        int indiceABorrar= Arrays.binarySearch(copia,n);
        if (indiceABorrar>=0)
        System.arraycopy(copia, indiceABorrar+1,
                copia, indiceABorrar, copia.length-indiceABorrar-1);
        copia=Arrays.copyOf(copia,copia.length-1);
        return copia;
    }

    static int[] insercionNoOrdenada(int []x, int n) {
        x = Arrays.copyOf(x, x.length + 1);
        x[x.length - 1] = n;

        return x;
    }
}
