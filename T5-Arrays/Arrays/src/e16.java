/*
* Escribe la funcion void desordenar (int t[]), que cambia de forma aleatoria los elementos contenidos en la
* tabla t.
*
* */

import java.util.Arrays;

public class e16 {
    public static void main(String[] args) {
        int[] t={2,4,6,8,10};

        desordenar(t);

    }

    static void desordenar(int[] t) {
        for (int i=0; i< t.length; i++){
            int iAzar = (int) (Math.random() * t.length);
            int n = t[iAzar];
            t[iAzar] = t[i];
            t[i] = n;

        }
        System.out.print(Arrays.toString(t));
    }

}
