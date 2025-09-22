package Ejercicio2;

import Ejercicio1.Lista;

/*
* Definir la interfaz Pila para numeros enteros
* */
public class Main {
    public static void main(String[] args) {
        Lista l = new Lista();
        l.apilar(2);
        l.apilar(3);
        l.apilar(4);
        l.apilar(5);
        l.apilar(6);
        l.apilar(7);
        l.apilar(8);
        System.out.println(l);
        System.out.println(l.desapilar());
        System.out.println(l.desapilar());
        System.out.println(l.desapilar());
        System.out.println(l.desapilar());
        System.out.println(l);
    }
}
