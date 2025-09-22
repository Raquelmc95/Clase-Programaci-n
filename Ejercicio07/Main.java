package Ejercicio07;

import java.util.ArrayList;
import java.util.Collection;

/*
* Repite el ejercicio anterior usando metodos globales
* */
public class Main {
    public static void main(String[] args) {
        Collection<Integer> lista = new ArrayList<>();
        for (int i = 0; i<100; i++) lista.add((int) (Math.random() * 10 + 1));
        System.out.println("Lista completa: " + lista);

        Collection<Integer> c = new ArrayList<>();
        c.add(5);
        c.add(7);
        //hay que crear una coleccion para que nos elimine todos los de la lista que queramos eliminar
        lista.removeAll(c);
        System.out.println("Lista despues: "+lista);
    }
}
