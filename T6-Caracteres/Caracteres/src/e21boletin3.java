import java.util.Scanner;

public class e21boletin3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño del cuadrado mágico (impar entre 3 y 11): ");
        int n = sc.nextInt();

        int t [][]= new int[n][n];

        int f =0;
        int c =n/2;

        for (int num =1; num<n*n; num++){
            t[f][c]=num;
            int nuevaf=(f-1+n)%n;
            int nuevac=(c+1)%n;

            if (t[nuevaf][nuevac]!=0){
                f=(f+1)%n;
            }else {
                f=nuevaf;
                c=nuevac;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
    }
}
