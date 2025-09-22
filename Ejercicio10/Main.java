package Ejercicio10;

import java.util.*;

/*
* Inserta en una lista 20 enteros aleatorios entre 1 y 10. A partir de ella, crea un conjunto de los elementos de la
* lista sin repetir, otro con los repetidos y otro con los elementos que aparecen una sola vez en la lista original
* */
public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) lista.add((int) (Math.random() * 10 + 1));
        System.out.println(lista);

        //Ordenanos la lista para facilitar la visualizacion de los elementos
        Comparator<Integer> c = Comparator.naturalOrder();//un comparador de orden natural
        lista.sort(c);//le paso ese orden al metodo sort ya que te lo solicita
        System.out.println("Lista orginal: "+lista);

        //Creamos un conjunto
        Set<Integer> sinRepeticiones = new TreeSet<>();//treeset es para un conjunto de orden menor a mayor
        sinRepeticiones.addAll(lista);//incluimos todos los elementos de la lista en el conjunto
        System.out.println("Lista sin repeticiones: "+sinRepeticiones);

        //Creamos otro conjunto
        Set<Integer> repetidos = new TreeSet<>();
        for (Integer e: sinRepeticiones) lista.remove(e);
        repetidos.addAll(lista);
        System.out.println("Repetidos: "+repetidos);

        Set<Integer> unicos = new TreeSet<>();
        unicos.addAll(sinRepeticiones);
        unicos.removeAll(repetidos);
        System.out.println("No repetidos: "+unicos);

    }
}
