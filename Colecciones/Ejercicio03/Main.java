package Ejercicio03;


/*
* Definir la interfaz Pila con parametros genericos. A continuacion, implementar la interfaz Pila
* generica en la clase Contenedor.
* Por último, escribir un programa donde se use un objeto contenedor como pila. En ella apilamos
* varios numeros, los desapilamos y los mostramos.
* */
public class Main {
    public static void main(String[] args) {
        Pila<Integer> p = new Contenedor<>(new Integer[0]);//le pasamos al constructor un arrays de Integer
        for (int i=0; i<20; i++){
            p.apilar((int)(Math.random()*20));
        }
        System.out.println(p);
        System.out.println(p.desapilar());
        System.out.println(p.desapilar());
        System.out.println(p.desapilar());
        System.out.println(p.desapilar());
        System.out.println(p);
    }
}
