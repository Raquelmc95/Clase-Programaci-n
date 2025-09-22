//Crear una funcion con el siguiente prototipo.
//Boolean esPrimo(int n)
//que devuelve true si n es primo y false si no lo es

import java.util.Scanner;

public class e6 {
    public static void main(String[] args) {

        for (int i=1; i<=15; i++){
            if (esprimo (i)) System.out.println(i+ " ES PRIMO");
            else System.out.println(i+ " No es primo");
        }


    }

    static boolean esprimo(int num) {
        boolean primo = true;
        int i = 2;
        if (num<2) primo = false;
        while (i<num && primo==true){
            if (num%i == 0) primo = false;
            i++;
        }

        return primo;
    }
}
