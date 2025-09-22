package Ejercicio12;

import java.util.HashSet;
import java.util.Set;

/*
* Implementa un metodo estatico que lleva a cabo  la union de dos conjuntos de elementos genericos. La union es nuevo
* conjunto. La union es un nuevo conjunto
* */
public class Main {
    public static void main(String[] args) {
        Set<Integer> c1= new HashSet<>();
        c1.add(23);
        c1.add(24);
        c1.add(2);
        c1.add(2);
        c1.add(2);
        c1.add(21);
        c1.add(233);
        System.out.println(c1);

        Set<Integer> c2= new HashSet<>();
        c2.add(257);
        c2.add(21);
        c2.add(233);
        c2.add(1);
        System.out.println(c2);
        System.out.println("Union: "+union(c1,c2));
        System.out.println("Interseccion: "+interseccion(c1,c2));

    }
    static <E> Set<E> union (Set<E> conj1, Set<E> conj2){
        Set<E> resultado = new HashSet<>(conj1);
        resultado.addAll(conj2);
        return resultado;
    }
    static <E> Set<E> interseccion (Set<E> conj1, Set<E> conj2){
        Set<E> resultado = new HashSet<>(conj1);
        resultado.retainAll(conj2); //retiene del conjunto 1 solo los que están en el conjunto 2
        return resultado;
    }
}
