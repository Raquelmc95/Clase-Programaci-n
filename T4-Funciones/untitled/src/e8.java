//Diseña la funcion calculadora(), a la que se le pasa dos numeros reales
//(que son los operandos) y la operacion que se quiere realizar.
//La operacion es 1(para sumar), 2 (para restar), 3(para multiplicacion) y 4 (divisiion)
//La funcion devuelve un nº real.

import java.util.Scanner;

public class e8 {
    public static void main(String[] args) {
       for (int operacion=1; operacion<=4; operacion++){
           double resultado = calculadora( 3.0,4.0, operacion);
           System.out.println(resultado);
       }


    }
    static double calculadora(double a, double b, int op){
        double res=0;
        res = switch (op){
            case 1 -> a + b;
            case 2 -> a - b;
            case 3 -> a * b;
            case 4 -> a / b;
            default -> {
                System.out.println("Operacion no valida");
                yield 0;
            }

        };
        return res;
    }
}
