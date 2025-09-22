/*
* El "numero ideal" de una persona se calcula a partir de sus numeros preferidos.
* De entre estos, se selecciona, dos distintos al azar que se eliminaran de la lista, pero en su lugar
* se añade la media de los dos eliminados.
* El proceso se repite hasta que solo queda un numero. La lista de numeros siempre va a estar ordenada.
* Escribe un programa que, a partir de una lista con los numeros preferidos, calcule y muestre nuestro
* numero ideal.
* rango del tamaño de la tabla calculo la media con un cast de los dos al azar e inserto esa media y borro los dos
* numeros y la lista va a tener cada vez un numero menos.
* */

import java.util.Arrays;

public class e14 {
    public static void main(String[] args) {
        int [] t ={5,7,18,25,30,72,96,112,137,231,256,312};
        System.out.println("Mi numero ideal es: "+numeroIdeal(t));

    }

    static int numeroIdeal(int[] t) {
        System.out.println(Arrays.toString(t));
        int media;
        while (t.length>1){
            int nAzar1 = (int) (Math.random() * t.length);
            int n1 = t[nAzar1];
            System.out.println("Borra: "+n1);
            t=borradoOrdenada(t,n1);
            int nAzar2 = (int) (Math.random() * t.length);
            int n2 = t[nAzar2];
            System.out.println("Borra: "+n2);
            t=borradoOrdenada(t,n2);
            media = (n1 + n2) / 2;
            System.out.println("Media: "+media);
            t = InserccionOrdenada(t, media);
            System.out.println(Arrays.toString(t));

        }
        return t[0];
    }
    static int[] InserccionOrdenada(int[] d, int n) {
        int indiceInser = Arrays.binarySearch(d,n);
        if (indiceInser<0)indiceInser=-indiceInser-1;
        int copia[]=new int[d.length+1];
        System.arraycopy(d,0,
                copia,0,indiceInser);
        System.arraycopy(d, indiceInser,copia,indiceInser+1,d.length-indiceInser);
        copia[indiceInser]=n;
        d=copia;

        return d;


    }
    static int[] borradoOrdenada(int[] x, int n){
        int indiceBorrado = Arrays.binarySearch(x, n);
        if (indiceBorrado>=0){
            System.arraycopy(x, indiceBorrado+1,
                    x,indiceBorrado,x.length-indiceBorrado-1);
            x=Arrays.copyOf(x, x.length-1);
        }
        return x;
    }
}
