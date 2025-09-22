package Boletin2_3;

public class Main {
    public static void main(String[] args) {
        Caja c1 = new Caja(150,75,50,"cm");
        Caja c2 = new Caja(200,75,75,"cm");

        c1.setEtiqueta("Calle Algarrobo, 15");
        c2.setEtiqueta("Calle Peral, 5");

        System.out.println("Volumen c1: "+c1.getVolumen());
        System.out.println("Volumen c2: "+c2.getVolumen());

        System.out.println(c1);
        System.out.println(c2);

        CajaCarton c3=new CajaCarton(100,250,75);
        c3.setEtiqueta("Plaza Central, 12");
        System.out.println("Volumen c3: "+c3.getVolumen());
        System.out.println("Superficie: "+c3.dameSuperficieTotal());
        System.out.println(c3);

    }
}
