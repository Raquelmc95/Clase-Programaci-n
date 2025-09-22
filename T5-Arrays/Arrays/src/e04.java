/*
* Crear una funcion: int maximo(int t[]), que devuelva el maximo valor contenido en la tabla t.
* Probar la funcion desde el main.
* */

import java.util.Scanner;

public class e04 {
    public static void main(String[] args) {
        int t[] = new int[4];
        System.out.print("El maximo es: "+maximo(t));
    }

    static int maximo(int n[]) {
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<n.length; i++){
            System.out.print("Teclea un nº: ");
            n[i] = sc.nextInt();
        }
        int res=0;
        for (int valor:n){
            if (valor>res){
                res = valor;
            }

        }
        return res;
    }
}
