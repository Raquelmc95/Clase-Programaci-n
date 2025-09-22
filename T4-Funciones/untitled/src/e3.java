//Escribe una funcion que calcule y muestre el área o el volumen de un cilindro
//segun se especifique.
//Para hacer esto se pasará a la funcion un 1 para el área o un 2 para el volumen
//Ademas hay que pasar a la funcion el radio de la base y la altura.

import java.util.Scanner;

public class e3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclee radio: ");
        double r = sc.nextDouble();
        System.out.println("Teclee altura: ");
        double a = sc.nextDouble();
        System.out.println("Teclee (1) volumen (2) area: ");
        int o = sc.nextInt();

        areaVolumenCilindro(r, a, o);
    }

    static void areaVolumenCilindro(double rad, double alt, int opc) {
        double area, volumen;
        switch (opc){
            case 1 -> {
                volumen = Math.PI * Math.pow(rad, 2) * alt;
                System.out.println("El volumen es: "+volumen);
            }
            case 2 -> {
                area = 2 * Math.PI * rad * (alt + rad);
                System.out.println("El area es: "+area);

            }
        }

    }
}
