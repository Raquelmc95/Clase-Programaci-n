import java.util.Locale;
import java.util.Scanner;

/*
* Escribir un programa que pide al usuario cuantos numeros desea introducir. Meter por teclado esa cantidad
* de numeros y luego mostrarlos en el orden inverso al introducirlo.
* */
public class e03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de nums a meter: ");
        int num = sc.nextInt();

        int t[] = new int[num];
        for (int i=0; i<t.length; i++){
            System.out.print("num "+i+": ");
            t[i] = sc.nextInt();
        }
        System.out.println("Invertido es....");
        for (int i=t.length-1; i>=0; i--){
            System.out.print(t[i]+" ");
        }

    }
}
