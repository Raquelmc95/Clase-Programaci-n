//Escribe una funcion que recibe dias, horas y minutos.
//La funcion devuelve el numero de segundos correspondientes.

import java.util.Scanner;

public class e16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dias, horas, minutos;
        System.out.println("Teclee dias: ");
        dias = sc.nextInt();
        System.out.println("Teclee horas: ");
        horas = sc.nextInt();
        System.out.println("Teclee minutos: ");
        minutos = sc.nextInt();

        System.out.println("Los segundos correspondientes son: "+segundos(dias, horas, minutos));

    }

    static int segundos(int d, int h, int min) {
        int res;
        res = (((d * 24)*60)*60) + ((h *60)*60) + (min * 60);
        return res;
    }
}

