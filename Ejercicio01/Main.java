package Ejercicio01;

import java.util.Arrays;

/*
* Crear un metodo generico estatico que realce la insercion de un objeto al
* final de una tabla, ambos del mismo tipo genérico, que se pasan como parametros.
* Devuelve una nueva tabla con el resultado de la insercion.
* */
public class Main {
    public static void main(String[] args) {
        String cadenas[]={};
        System.out.println(Arrays.toString(cadenas));
        cadenas = guardar("coche", cadenas); //le paso un string porque es como un objet y el arrays de cadena
        cadenas = guardar("avion", cadenas); //le paso un string y el arrays de cadena
        System.out.println(Arrays.toString(cadenas));


    }
    //E[] es lo que va a devolver el metodo
    static <E> E[] guardar(E elem, E[] tabla){//La E es generico, le paso un objeto de E y una tabla del tipo E
        E [] nuevaTabla = Arrays.copyOf(tabla, tabla.length+1);
        nuevaTabla[nuevaTabla.length-1]= elem;
        return nuevaTabla;

    }
}
