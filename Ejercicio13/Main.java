package Ejercicio13;
/*
* Crear la clase Sorteo con parametros genericos. Deberá guardar un conjunto de valores distintos de tipo generico
* que se les suministra, y sera capaz de generar una combinacion premiada de un tamaño determinado.
* Deben de implementarse los metodos:
* -boolean add(T elemento), añade un elemento nuevo al conjunto de valores posibles en una apuesta, devuelve true si
* el elemento se añadió y false en caso contrario, debido a que ya estaba presente
* -Set<T> premiados(int numPremiados), devuelve una combinacion ganadora de numPremiados elementos distintos
* */
public class Main {
    public static void main(String[] args) {
        Sorteo<Integer> s = new Sorteo<>();
        for (int i=1; i<100; i++) s.add(i);
        System.out.println(s);
        System.out.println("Premiados: "+s.premiados(20)); //le paso que me saque 20 premiados
        System.out.println("Premiados: "+s.premiados(20));
    }
}
