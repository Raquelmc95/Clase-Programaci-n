/*
* Crea un programa para gestionar la seleccion de programadores, donde se introduce la puntuacion(enteros)
* obtenida por 5 programadores.
* El programa debe mostrar las puntuaciones de forma ordenada.
* En ocasiones hay que añadir la puntuacion de algun programador mas que se suma a la seleccion a ultima hora
* La forma de especificar que no hay mas programadores que puntuar es tecleando -1.
* El programa muestra al final la puntuacion ordenada de todos los participantes en la seleccion.
* */

import java.util.Arrays;
import java.util.Scanner;

public class e09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] t = {10,12,15,18,20};

        Arrays.sort(t); //esto es para la lista desordenada para que la ordene
        System.out.println(Arrays.toString(t));//y aqui los imprime ordenados

        int n;
        System.out.print("Introduce una calificacion: ");
        n = sc.nextInt();
        while (n!=-1){
            //INSERTA NUEVO EN LA TABLA
            int indiceInser = Arrays.binarySearch(t, n);
            if (indiceInser<0) indiceInser = -indiceInser-1;
            int[] copia = new int[t.length+1];
            //copia los de la izq de nuevo HASTA EL INDICE NUEVO
            System.arraycopy(t,0,
                    copia,0, indiceInser); //aqui copia la celda 0, 1 y deja un hueco en blanco en la celda 2
            //copia los de la dcha de nuevo DESPUES DEL INDICE NUEVO DEJANDO UN HUECO
            System.arraycopy(t, indiceInser,
                    copia,indiceInser+1,t.length-indiceInser);//aqui copia la celda desde el 3 porque al indiceInser que es 2 se le suma 1 y por eso copia desde la 3, 4 y 5
            copia[indiceInser] = n; //aqui la celda 2 tomaria el valor de n
            t = copia;
            System.out.print("Introduce una calificacion: ");
            n = sc.nextInt();

        }
        System.out.println(Arrays.toString(t));


    }
}
