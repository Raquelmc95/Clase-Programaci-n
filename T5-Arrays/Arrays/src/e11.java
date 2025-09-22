/*
* Crea el juego el maletin, que consiste en abrir un maletin adivinando la combinacion de su cerradura formada por
* varios digitos cada uno de ellos del 1 al 5. El programa genera aleatoriamente la combinacion secreta
* que el jugador tendra que acertar.
* En cada intento se muestran pistas de si el digito es mayor o menor que el introducido.
* */

import java.util.Arrays;
import java.util.Scanner;

public class e11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digitos;
        System.out.print("Cuantos digitos tiene el maletin: ");
        digitos = sc.nextInt();
        int[] secreto = new int[digitos];
        int[] combJug = new int[digitos];

        generaCombinacion(secreto);
        System.out.println("la combinacion secreta es" + Arrays.toString(secreto));
        System.out.println("Escriba una combinacion");
        leeTabla(combJug);

        while (!Arrays.equals(secreto, combJug)){
            muestraPistas(secreto, combJug);
            System.out.println("Escriba una combinacion: ");
            leeTabla(combJug);
        }
        System.out.println("¡El maletin está abierto!");

    }
    static void generaCombinacion(int t[]){
        for (int i=0; i< t.length; i++){
            t[i]=(int)(Math.random()*5+1);
        }
    }
    static void leeTabla(int t[]){
        Scanner sc = new Scanner(System.in);
        for (int i=0; i< t.length; i++){
            t[i]=sc.nextInt();
        }
    }
    static void muestraPistas(int secret[], int jug[]){
        for (int i=0; i<jug.length; i++){
            if (secret[i]>jug[i]){
                System.out.println("M");
            }else if (secret[i]<jug[i]){
                System.out.println("m");
            }else {
                System.out.println(secret[i]);
            }

        }
    }


}
