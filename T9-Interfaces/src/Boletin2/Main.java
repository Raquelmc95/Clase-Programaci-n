package Boletin2;

public class Main {
    public static void main(String[] args) {
        Lista nombres= new Lista();
        nombres.apilar("Maria");
        nombres.apilar("Alejando");
        nombres.apilar("Sandra");
        nombres.apilar("Pedro");
        nombres.apilar("Miguel");
        nombres.apilar("Ana");
        System.out.println(nombres);
        System.out.println(nombres.desapilar());
        System.out.println(nombres.desapilar());
        System.out.println(nombres.desapilar());
        System.out.println(nombres);
        nombres.encolar("Benito");
        System.out.println(nombres);
        System.out.println(nombres.desencolar());
        System.out.println(nombres);
    }
}
