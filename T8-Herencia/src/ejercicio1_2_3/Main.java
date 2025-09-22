package ejercicio1_2_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hora r = new Hora(11, 30);
        System.out.println(r); //asi mismo esta llamando a la clase to string

        for (int i=1; i<=61; i++){
            r.inc();
        }
        System.out.println(r);

        System.out.println("Escribe una hora: ");
        int hora=new Scanner(System.in).nextInt();

        boolean cambio = r.setHora(hora);
        if (cambio){
            System.out.println(r);
        }else {
            System.out.println("La hora no se pudo cambiar");
        }

        HoraExacta r2 = new HoraExacta(11,15,23);
        System.out.println(r2);

        HoraExacta r3 = new HoraExacta(10,15,23);
        System.out.println(r2.equals(r3));



    }
}
