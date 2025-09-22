package Ejercicio5;

import Ejercicio1.Lista;

/*
* Implementa un programa en el que, usando una cola anonima se encolan numeros enteros. Luego se
* desencolan varios.
* */
public class Main {
    public static void main(String[] args) {
        Cola cola = new Cola() {
            Lista l = new Lista();
            @Override
            public void encolar(Integer o) {
                l.insertaFinal(o);

            }

            @Override
            public Integer desencolar() {
                return l.eliminar(0);
            }
            @Override
            public void mostrar(){
                System.out.println(l);
            }
        };
        cola.encolar(4);
        cola.encolar(5);
        cola.encolar(6);
        cola.encolar(7);
        cola.mostrar();
        //si quiero imprimirlo tengo que crear un metodo de mostrar en la interfaz cola y aplicarla
        //arriba y en la clase lista del ejercicio 1 para que no de error
        System.out.println(cola.desencolar());
        System.out.println(cola.desencolar());
        cola.mostrar();

    }
}
