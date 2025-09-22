package Ejercicio04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* Implementa una aplicacion que de entrada a numeros enteros no negativos. Los numeros se iran
* insertando en una coleccion, pudiendose repetir.
* Luego se mostrará por pantalla.
* Luego se mostrará todos los valores pares. Por ultimo se eliminaran todos los multiplos de 3,
* y se mostrará lo que resulta.
*
*
* */
public class Main {
    public static void main(String[] args) {
        Collection<Integer> numeros = new ArrayList<>(); //usamos arraylist porque pueden repetirse
        for (int i=0; i<20; i++) numeros.add((int)(Math.random()*10+1));
        System.out.println("Lista completa: "+numeros);
        for (Integer e:numeros) if (e%2==0) System.out.print(e+" ");
        System.out.println();

        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {//mientras que haya un proximo
            int n = it.next();//sacamos el elemento en cuestion
            if (n%3==0) it.remove();//si es multiplo de 3 lo eliminamos
        }
        System.out.println("No multiplos de 3 "+numeros);


    }
}
