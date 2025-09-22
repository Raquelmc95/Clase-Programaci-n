import java.util.Scanner;

public class e17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

        String prefijo = "Javalín, javalón";
        String sufijo = "javalén, len len";

        boolean empieza = false;


        if (frase.startsWith(prefijo)) {
                empieza=true;
                frase = frase.substring(prefijo.length());
        } else if (frase.endsWith(sufijo)) {
                empieza=true;
                frase = frase.substring(0, frase.length()-sufijo.length());
        }
        if (empieza){
            frase=frase.stripLeading();
            frase=frase.stripTrailing();
            System.out.println(frase);
        }else {
            System.out.println("No está en el idioma de Javalandia");
        }

    }
}
