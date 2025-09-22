package Ejercicio06;

import java.util.ArrayList;
import java.util.Collection;

/*
* Crea un programa donde se insertan 100 numeros aleatorios entre 1 y 10 en una coleccion.
* Luego elimina los que valen 5. Mostrar la coleccion antes y despues.
* */
public class Main {
    public static void main(String[] args) {
        Collection<Integer> lista = new ArrayList<>();
        for (int i = 0; i<100; i++) lista.add((int)(Math.random() * 10 + 1));
        System.out.println("Lista completa: " + lista);

        while (lista.remove(5));
        //mientras que hayan 5 que eliminar no va a parar el while porque devuelve el remove true si lo ha encontrado
        System.out.println("Lista despues: "+lista);
    }
}
