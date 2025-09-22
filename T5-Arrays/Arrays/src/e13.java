/*
* Primero escribe en una función el comportamiento de la insercion ordenada.
* Luego, creo una función que realice el borrado de un elemento de una tabla ordenada.
* Comprueba el funcionamiento llamando a la funcion desde el main.
*
* */

import java.util.Arrays;

public class e13 {
    public static void main(String[] args) {
        int t[] = {12,34,45,54,67,70};
        int aInsertar =50;
        int aBorrar =34;

        System.out.println("Tabla con el valor insertado: "+ Arrays.toString(InserccionOrdenada(t,aInsertar)));
        System.out.println("Tabla con el valor borrado: "+Arrays.toString(borradoOrdenada(InserccionOrdenada(t,aInsertar),aBorrar)));

    }

    static int[] InserccionOrdenada(int[] d, int n) {
        int indiceInser = Arrays.binarySearch(d,n);
        if (indiceInser<0)indiceInser=-indiceInser-1;
        int copia[]=new int[d.length+1];
        System.arraycopy(d,0,
                copia,0,indiceInser);
        System.arraycopy(d, indiceInser,
                copia,indiceInser+1,d.length-indiceInser);
        copia[indiceInser]=n;
        d=copia;

        return d;


    }
    static int[] borradoOrdenada(int[] x, int n){
        int indiceBorrado = Arrays.binarySearch(x, n);
        if (indiceBorrado>=0){
            System.arraycopy(x, indiceBorrado+1,
                    x,indiceBorrado,x.length-indiceBorrado-1); //Copiamos el ultimo valor
            x=Arrays.copyOf(x, x.length-1); //disminuimos la tabla
        }
        return x;
    }
}
