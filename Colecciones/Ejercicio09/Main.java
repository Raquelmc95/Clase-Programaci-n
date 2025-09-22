package Ejercicio09;

import java.util.ArrayList;
import java.util.List;

/*
* Crea una lista de enteros positivos. A continuación, recorre la lista y muestra los indices de los elementos de valor
* par multiplicado por 100.
* */
public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) lista.add((int) (Math.random() * 10 + 1));
        System.out.println(lista);
        System.out.println("Indices de valores pares ....");

        for (int i=0; i<lista.size(); i++){
            if (i%2==0) {
                System.out.println(i + " ");
                lista.set(i, lista.get(i) * 100);//el set va a guardar en el valor i lo que me de en el get que el get me da el valor de i
            }
        }
        System.out.println();
        System.out.println(lista);
    }
}
