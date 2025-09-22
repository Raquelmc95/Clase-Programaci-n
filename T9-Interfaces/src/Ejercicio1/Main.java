package Ejercicio1;
/*
* Definir la interfaz Cola para numeros enteros e implememtarla en la clase Lista, definida en tema anteriores
*
* */
public class Main {
    public static void main(String[] args) {
        Lista l = new Lista();
        l.encolar(4);
        l.encolar(3);
        l.encolar(5);
        l.encolar(6);
        l.encolar(41);
        l.encolar(43);
        System.out.println(l);
        System.out.println(l.desencolar());
        System.out.println(l.desencolar());
        System.out.println(l.desencolar());
        System.out.println(l.desencolar());
        System.out.println(l);

    }
}
