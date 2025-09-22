package Ejercicio08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/*
* Crea un programa donde se insertan 20 aleatorios en una coleccion.
* Esta se ordenará de menor a mayor, convirtiendola antes en tabla y volviendola a convertir en
* coleccion. Repetir el proceso para ordenarla de mayor a menor.
* */
public class Main {
    public static void main(String[] args) {
        Collection<Integer> lista = new ArrayList<>();
        for (int i = 0; i<20; i++) lista.add((int) (Math.random() * 10 + 1));
        System.out.println("Lista completa: " + lista);

        //esto convierte una coleccion en un arrays
        Integer[] tabla = lista.toArray(new Integer[0]);
        Arrays.sort(tabla);//ordenamos la tabla de menor a mayor
        System.out.println(Arrays.toString(tabla));//la imprimimos

        Collection<Integer> listaCreciente = new ArrayList<>();//creamos una coleccion para pasar un arrays a una coleccion
        listaCreciente.addAll(Arrays.asList(tabla));//pasamos a coleccion el arrays
        System.out.println(listaCreciente);//imprimimos la coleccion

        //para ordenar un arrays de mayor a menor tenemos que crear un objeto de la clase comparator
        Comparator<Integer> ordenDecreciente = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o2-o1;
            }
        };
        Arrays.sort(tabla, ordenDecreciente);//ordenamos la tabla segun ese orden
        Collection<Integer> listaDecreciente = new ArrayList<>();
        listaDecreciente.addAll(Arrays.asList(tabla));//pasamos la tabla a coleccion
        System.out.println(listaDecreciente);//la imprimimos

    }
}
