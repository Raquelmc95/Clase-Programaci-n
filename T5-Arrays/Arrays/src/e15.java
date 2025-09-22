/*
* Crea una funcion: int[] buscarTodos(int t[], int clave), que crea y devuelve una tabla con todos los
* indices de los elementos donde se encuentra la clave de busqueda. Si la clave no se encuentra en la tabla
* la funcion devuelve una tabla vacía.
*
* */

import java.util.Arrays;

public class e15 {
    public static void main(String[] args) {
        int[] t1={5,7,2,7,14,2,3};
        int clave =7;
        int[] t2= buscarTodos(t1,clave);

        System.out.print(Arrays.toString(t2));



    }
    static int[] buscarTodos(int[] t1, int clave) {
        int t2 [] = new int[0];
        for (int i=0; i<t1.length; i++){
            if (t1[i] == clave) {
                t2 = insercionNoOrdenada(t2,i);
            }
        }
        return t2;


    }
    static int[] insercionNoOrdenada(int []x, int n){
        x = Arrays.copyOf(x, x.length+1);
        x[x.length-1] = n;

        return x;
    }
}
