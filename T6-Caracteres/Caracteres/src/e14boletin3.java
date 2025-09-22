import java.util.Arrays;
import java.util.Scanner;

public class e14boletin3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String camel = sc.nextLine();

        String palabras[]=camel.split(" ");
        System.out.println(Arrays.toString(palabras));
        String resultado="";

        for (int i=0; i<palabras.length; i++){
            String c = palabras[i].toLowerCase();
            resultado+=c;
        }
        System.out.println(resultado);
        for (int i=0; i<resultado.length(); i++){

        }

    }
}
