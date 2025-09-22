/*
* Una funcion para descodificar el ejercicio 11 enviado la palabra codificada y la tiene que mostrar
* descodificada.
* */

public class e18 {
    public static void main(String[] args) {
        char [] conjunto1= {'e','i','k','m','p','q','r','s','t','u','v'};
        char [] conjunto2= {'p','v','i','u','m','t','e','r','k','q','s'};
        String palabra ="matqvko";
        palabra =palabra.toLowerCase();
        char [] codificado = new char[palabra.length()];

        for (int i=0; i<palabra.length(); i++){
            char c = palabra.charAt(i);
            codificado[i] = descodifica(conjunto1,conjunto2,c);

        }
        palabra=String.valueOf(codificado);
        System.out.println("Descodificado: "+palabra);
    }

    /*static char codifica(char[] conjunto1, char[] conjunto2, char c) {
        for (int i=0; i<conjunto1.length; i++){
            if (conjunto1[i]==c) {
                return conjunto2[i];
            }

        }
        return c;

    }*/
    static char descodifica(char[] conjunto1, char[] conjunto2, char c) {
        String conj1 = String.valueOf(conjunto2);
        char codificado;
        int pos = conj1.indexOf(c);
        if (pos == -1) codificado = c;
        else codificado = conjunto1[pos];
        return codificado;
    }
}
