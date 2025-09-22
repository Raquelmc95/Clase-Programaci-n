//Escribe una funcion a la que se le pasa un nº entero
//y devuelve el nº de divisores primos que tiene.

public class e7 {
    public static void main(String[] args) {
        System.out.print("Numero de divisores primos de 24: "+numDivisoresPrimos(24));

    }
    static int numDivisoresPrimos(int num) {
        int cont = 0;

        for (int i = 2; i <= num; i++) {
            if (num % i == 0 && esPrimo(i)) {
                cont++;
                System.out.println(i);
            }
        }

        return cont;
    }

    static boolean esPrimo(int num) {
        boolean primo = true;
        int i = 2;
        if (num < 2) primo = false;
        while (i < num && primo == true) {
            if (num % i == 0) primo = false;
            i++;
        }
        return primo;

    }

}
