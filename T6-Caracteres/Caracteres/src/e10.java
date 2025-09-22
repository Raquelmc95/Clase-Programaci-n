/*
* Pide una palabra o frase, e indica si es palindromo, es decir, se lee igual de izquiera a derecha
* que de derecha a izquierda, sin tener en cuenta los espacios.
* Nota: teclear sin tildes
*Ejemplo: Le avisara Sara si va el, yo hago yoga hoy, Eva usaba rimer y le miraba suave
* */

import java.util.Locale;
import java.util.Scanner;

public class e10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = "", sinEspacios, invertida;
        System.out.print("Frase: ");
        frase = sc.nextLine();
        frase =frase.toLowerCase(); //para quitarle las mayusculas
        sinEspacios = eliminaEspacios(frase);
        invertida= alReves(sinEspacios);
        if (invertida.equals(sinEspacios)){
            System.out.println("Es palindromo.");
        }else {
            System.out.println("No es palindromo.");
        }
    }

    static String eliminaEspacios(String f) {
        String sin ="";
        for (int i=0; i<f.length(); i++){
            char c = f.charAt(i);
            if (!Character.isWhitespace(c)){ //te detesta si el caracter es un espacio y si es un espacio no lo mete en sin
                sin = sin+c;
            }
        }
        return sin;
    }

    static String alReves(String sinEspa) {
        String nueva = "";
        for (int i=0; i<sinEspa.length(); i++)
            nueva=sinEspa.charAt(i)+ nueva; //devuelve el caracter de cada frase y suma nueva
        return nueva;
    }
}
