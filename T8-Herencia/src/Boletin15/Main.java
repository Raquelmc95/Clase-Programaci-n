package Boletin15;

public class Main {
    public static void main(String[] args) {
        CalendarioExacto c1 = new CalendarioExacto(1,2,2025,14,18);
        CalendarioExacto c2 = new CalendarioExacto(1,2,2025,14,18);
        System.out.println("Las fechas son iguales: "+c1.equals(c2));

        System.out.println(c1.toString());
        c1.incrementaHora();
        c1.incrementaMinuto();
        c1.incrementarDia();
        c1.incrementarMes();
        c1.incrementarAnio(1);
        System.out.println("Las fechas son iguales: "+c1.equals(c2));
    }
}
