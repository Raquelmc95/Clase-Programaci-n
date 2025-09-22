package Boletin14;

public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(2,4);
        Punto p2 = new Punto(2,4);

        System.out.println("Distancia entre p1 y p2: "+p1.distancia(p2));
        System.out.println("Los puntos son iguales: "+p1.equals(p2));

        Punto3D p1d=new Punto3D(2,3,7);
        Punto3D p2d=new Punto3D(8,9,10);

        System.out.println("Distancia entre p1d y p2d: "+p1d.distancia(p2d));
        System.out.println("Los puntos son iguales: "+p1d.equals(p2d));


    }
}
