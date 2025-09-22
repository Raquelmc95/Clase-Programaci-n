import java.util.Arrays;
import java.util.Scanner;

public class e21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int o;
        int [][] matriz = new int[7][7];
        int x = 2;
        int y =5;
        int lado=5;
        char c = '-';
        char a = '@';

        System.out.print("Elige opcion 1 para un cuadrado o 2 para un triangulo: ");
        o = sc.nextInt();

        while (o<0 || o>2){
            System.out.print("Elige opcion 1 para un cuadrado o 2 para un triangulo: ");
            o = sc.nextInt();
        }

        //if (o==1) esUnCuadrado(matriz,x,y,lado,c,a);

        //else esUnTriangulo(matriz);


    }

    static void esUnTriangulo(int[][] m) {
        for (int i=0; i<m.length; i++){
            for (int j=0; j<m[i].length; j++){
                if (i==2 && j==3 ||i==3 && j==2 || i==4 && j==1 || i==4 && j==2 || i==4 && j==3 || i==4 && j==4 || i==4 && j==5 || i==3 && j==4){
                    //m[i][j] = a;
                } else {
                    //m[i][j] = c;
                }
                System.out.print(m[i][j]+ " ");

            }
            System.out.println();
        }
    }

    static int[][] esUnCuadrado(int[][] m, int x, int y, int l, int a) {
        for (int i=0; i< m.length; i++){
            for (int j=0; j<m[i].length; j++){
                if (i==x || i==y || j==1 || j==m.length-2) {
                    m[i][j] = a;
                }
                System.out.print(m[i][j]+ " ");

            }
            System.out.println();
        }
        return m;
    }

}
