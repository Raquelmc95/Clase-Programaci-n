import java.util.Scanner;

public class e19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase en lenguaje C: ");
        String frase = sc.nextLine();

        String comenI="/*";
        String comenF="*/";

        int pos1, pos2;
        pos1 = frase.indexOf(comenI);
        pos2 = frase.indexOf(comenF);

        System.out.println(pos1);
        System.out.println(pos2);

        frase = frase.substring(0, pos1-1);

        System.out.println(frase);

    }
}
