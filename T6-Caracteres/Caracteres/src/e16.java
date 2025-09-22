import java.util.Arrays;
import java.util.Scanner;

public class e16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Introduce un nº: ");
        n = sc.nextInt();

        int [] t = new int[n];

        for (int i=0; i<t.length; i++){
            System.out.println("Introduce un nº: ");
            t[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(t));

        double mediaP=0, mediaN=0;
        int contP=0, contN=0, contCeros=0, positivo=0, negativos=0;
        for (int i=0; i<t.length; i++){
            if (t[i]==0) {
                contCeros++;
            } else if (t[i]>0) {
                positivo += t[i];
                contP++;
            } else {
                negativos += t[i];
                contN++;
            }
        }
        mediaP=(double) positivo/contP;
        mediaN= (double) negativos/contN;
        System.out.println("Hay "+contCeros+" ceros");
        if (contP==0) System.out.println("No podemos realizar la media");
        else System.out.println("La media de los positivos es: "+mediaP);
        if (contN==0)System.out.println("No podemos realizar la media");
        else System.out.println("La media de los negativos es: "+mediaN);
    }
}
