package Ejercicio05;

import java.util.ArrayList;
import java.util.Collection;

/*
* Crea una aplicacion que inserta 20 numeros aleatorios entre 1 y 10 (incluidos), que pueden
* estar repetidos en una coleccion. Despues se crea una lista con los mismos elementos sin
* repeticiones.
* */
public class Main {
    public static void main(String[] args) {
        Collection<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 20; i++) numeros.add((int) (Math.random() * 10 + 1));
        System.out.println("Lista completa: " + numeros);

        Collection<Integer> numerosSinRepetidos = new ArrayList<>();
        for (Integer e : numeros) if (!numerosSinRepetidos.contains(e)) numerosSinRepetidos.add(e);
        System.out.println("Lista completa sin repetidos: " +numerosSinRepetidos);
    }
}
