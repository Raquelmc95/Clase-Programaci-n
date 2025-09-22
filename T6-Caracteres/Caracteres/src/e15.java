import java.util.Scanner;

public class e15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contraseña, palabra;

        System.out.println("Teclee una contraseña: ");
        contraseña = sc.next();
        contraseña = contraseña.toLowerCase();

        /*System.out.println("PISTAS: ");

        /*int caracteres = contraseña.length();
        System.out.println("La contraseña tiene "+caracteres+" caracteres");
        System.out.println("La contraseña empieza por la letra "+contraseña.charAt(0)+" y termina por la letra "+contraseña.charAt(contraseña.length()-1));*/

        String aburrido ="fin";
        do {
            System.out.println("Introduce tu respuesta, pero si te aburres escribe fin ");
            palabra= sc.next();
            System.out.println("PISTAS");
            if (contraseña.compareTo(palabra)>0) System.out.println("La contrasña se encuentra alfabeticamente despues de tu respuesta");
            else System.out.println("La contrasña se encuentra alfabeticamente antes de tu respuesta");

        }while (!contraseña.equals(palabra) && !palabra.equals(aburrido));

        if (contraseña.equals(palabra)) System.out.println("Has adivinado la contraseña");
        else System.out.println("Te has aburrido");
    }

}
