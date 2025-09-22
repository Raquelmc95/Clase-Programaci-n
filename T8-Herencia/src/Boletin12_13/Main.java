package Boletin12_13;

public class Main {
    public static void main(String[] args) {
        Triangulo t = new Triangulo(2.5,5.5);
        Rectangulo r = new Rectangulo(1.5,6.5);

        System.out.println("Area triangulo: "+t.area());
        System.out.println("Area rectangulo: "+r.area());
    }
}
