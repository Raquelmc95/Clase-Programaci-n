/*
* Implementa la funcion: int[] suma(int t[], int n), que crea y devuelve una tabla con las sumas
* de los n elementos consecutivos de t.
* Ej: sea t = {10,1,5,8,9,2}
* la funcion suma devuelve {16, 14, 22, 19}
* donde 16=10+1+5, 14=1+5+8, 22=5+8+9 y 19=8+9+2
* */

import java.util.Arrays;

public class e18 {
    public static void main(String[] args) {
        int[] t={10,1,5,8,9,2};
        int n = 2;

        System.out.print("Tabla con la suma de los consecutivos de t "+Arrays.toString(suma(t,n)));

    }

    static int[] suma(int[] t, int n) {
        int[] t1 = new int[0];
        int suma=0;
        for (int i = 0; i <t.length; i++) {
            suma+=t[i];
            for (int j = 0; j <=n; j++) {
                int indiceAB = Arrays.binarySearch(t, t[0]);
                if (indiceAB >= 0) {
                    System.arraycopy(t, indiceAB + 1,
                            t, indiceAB, t.length - indiceAB - 1);
                    t = Arrays.copyOf(t, t.length - 1);

                }
                t1 = Arrays.copyOf(t1, t1.length + 1);
                t1[t1.length - 1] = suma;


            }
        }

        return t1;
    }
}
