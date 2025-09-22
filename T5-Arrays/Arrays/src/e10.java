/*
* Escribir la funcion int[] eliminarMayores(int t[], int valor) que crea y devuelve una copia de t
* donde se han eliminado los elementos mayores que valor.
* */

import java.util.Arrays;

public class e10 {
    public static void main(String[] args) {
        int[] t={20,32,45,7,12,23,87};
        int valor =30;

        System.out.println(Arrays.toString(eliminarMayores(t,valor)));

    }

    static int[] eliminarMayores(int[] t, int valor) {
        int copia[] = Arrays.copyOf(t, t.length);
        int i=0;
        while (i<copia.length){
            if (copia[i]>valor){
                //hay que eliminar copia[i]
                copia[i] = copia[copia.length-1]; //copia el ultimo
                copia=Arrays.copyOf(copia, copia.length-1); //disminuimos la longitud de copia
            }else {
                i++;
            }
        }
        return copia;
    }
}
