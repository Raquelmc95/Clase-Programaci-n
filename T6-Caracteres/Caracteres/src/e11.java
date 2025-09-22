/*
* Tenemos la siguiente relacion de letras:
*
* Conjunto 1: eikmpqrstuv
* Conjunto 2: pviumterkus
*
* Con esto es posible codificar un texto, convirtiendo cada letra del conjunto 1 en su correspondiente
* del conjunto 2.
* Es indistinto mayusculas y minusculas, mostrando siempre la codificacion en minusculas.
*
* Ejemplo: "PaquiTo" se codifica como "matqvko".
*
* Realizar un programa que codifique un texto. Para ello usar la siguiente funcion:
* char codifica (char [] conjunto1, char [] conjunto2, char c) que devuelve el caracter c codificado segun los
* conjuntos que se le pasan
* */

public class e11 {
    public static void main(String[] args) {
        char [] conjunto1= {'e','i','k','m','p','q','r','s','t','u','v'};
        char [] conjunto2= {'p','v','i','u','m','t','e','r','k','q','s'};
        String palabra ="PaquiTo";
        palabra =palabra.toLowerCase();
        char [] codificado = new char[palabra.length()];

        for (int i=0; i<palabra.length(); i++){
            char c = palabra.charAt(i);
            codificado[i] = codifica(conjunto1,conjunto2,c);

        }
        palabra=String.valueOf(codificado);
        System.out.println("Codificado: "+palabra);
    }

    /*static char codifica(char[] conjunto1, char[] conjunto2, char c) {
        for (int i=0; i<conjunto1.length; i++){
            if (conjunto1[i]==c) {
                return conjunto2[i];
            }

        }
        return c;

    }*/
    static char codifica(char[] conjunto1, char[] conjunto2, char c) {
        String conj1 = String.valueOf(conjunto1);
        char codificado;
        int pos = conj1.indexOf(c);
        if (pos == -1) codificado = c;
        else codificado = conjunto2[pos];
        return codificado;
    }
}
