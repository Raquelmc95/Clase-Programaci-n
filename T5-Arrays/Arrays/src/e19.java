/*
* Escribe un programa que solicite los numeros de una matriz 4*4. El programa dirá si la matriz es magica o no.
* Una matriz magica es aquella donde la suma de los numero de cualquier fila o columna vale lo mismo.
*
* boolean esMagica(int [][] matriz)
* */

import java.util.Arrays;
import java.util.Scanner;

public class e19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] num= new int[3][3];
        for (int i=0; i< num.length; i++){
            for (int j=0; j< num.length; j++){
                System.out.print("Teclee un nº: ");
                num[i][j]= sc.nextInt();

            }
        }
        for(int fila[] : num){
            for(int columna: fila){
                System.out.print(columna+ " ");
            }
            System.out.println();
        }
        System.out.println("La matriz es magica?: "+esMagica(num));
    }

    static boolean esMagica(int[][] matriz) {
        boolean magica = true;
        int patron=0;

        //sumamos la prima fila y comparamos las filas y las columnas con la suma de la primera fila
        for (int i=0; i<matriz.length; i++){
            patron+=matriz[0][i];
        }

        //Sumamos las columnas
        for (int j=0; j<matriz.length; j++){ //Si la matriz no es cuadrada, deberías usar matriz[0].length para el número de columnas en lugar de matriz.length
            int sumaC=0;
            for (int i=0; i<matriz.length; i++){
                sumaC+=matriz[i][j];
            }
            if (sumaC!=patron){
                magica=false;
            }

        }
        //sumamos las filas
        for (int i=0; i<matriz.length; i++){ // Aunque este código funciona para matrices cuadradas, si la matriz no es cuadrada (es decir, el número de filas y columnas es diferente), deberías reemplazar matriz.length en el bucle interno por matriz[i].length, que indica el número de columnas de la fila i.
            int sumaF=0;
            for (int j=0; j<matriz.length; j++){
                sumaF+=matriz[i][j];
            }
            if (sumaF!=patron){
                magica=false;
            }
        }
        return magica;
    }
}
