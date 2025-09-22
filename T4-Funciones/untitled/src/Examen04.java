//Crea un programa que comenzando desde el 1 encuentre y muestre por pantalla los 4 primeros numeros perfectos
//un numero es perfecto si es igual a la suma de todos sus divisores positivos sin incluir el propio numero
//ej: 6 tiene como divisores 1,2, 3 y 6. 6=1+2+3 por lo que 6 es un nº perfecto.

public class Examen04 {
    public static void main(String[] args) {
        int contador = 4, i=1;

        while (contador>0){
            if (esPerfecto(i)){
                System.out.print(i+", ");
                contador--;
            }
            i++;
        }

    }

    static boolean esPerfecto(int n) {
        boolean res =false;
        int i, suma=0;

        for (i=1; i<n; i++){
            if (n%i==0) suma+=i;

        }
        if (suma == n) res=true;
        
        return res;

    }
}
