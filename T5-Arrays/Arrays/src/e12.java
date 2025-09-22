/*Crea una tabla bidimensional de longitud 5x5 y rellenarla de la siguiente forma:
* el elemento de la posicion [n][m] debe contener el valor 10*n+m. Despues se debe mostrar
* su contenido.*/

import java.util.Arrays;
import java.util.Scanner;

public class e12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int datos[][]= new int[5][5]; //Declaramos datos como una tabla bidimensional
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                datos[i][j]= 10*i+j; //Esto es lo que aparece en la tabla por cada 0,1,2,3,4,5 de la tabla
            }
        }
        /*Esta forma me imprime la tabla en bidimensional*/
        for(int fila[] : datos){
               for(int columna: fila){
                   System.out.print(columna+ " ");
               }
               System.out.println();
         }
        /*Esto es lo que sustituye al Arrays.deepToString*/

        System.out.println(Arrays.deepToString(datos));
    }
}
