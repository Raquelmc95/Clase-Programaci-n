import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/*
* Pedir por teclado 5 nº decimales.
* Mostrarlos en el mismo orden que se han introducido.
* */
public class e02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double t[] = new double[5];
        for (int i=0; i<t.length; i++){
            System.out.print("numero "+i+": ");
            t[i] = sc.nextDouble();
        }
        System.out.println(Arrays.toString(t));
    }
}
