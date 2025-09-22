//Crea un programa que muestre todos los valores de un contador de 3 digitos empezando por 000
// y acabando en 999 con la particularidad de que cada vez que se deba mostrar un 3, muestre A.

public class Examen03 {
    public static void main(String[] args) {
        for (int i=0; i<=9; i++){
            for (int j=0; j<=9; j++){
                for (int k=0; k<=9; k++){
                    System.out.print(i!=3?i:"A");
                    System.out.print(j!=3?j:"A");
                    System.out.print(k!=3?k:"A");
                    System.out.println();
                }

            }
        }

    }
}
