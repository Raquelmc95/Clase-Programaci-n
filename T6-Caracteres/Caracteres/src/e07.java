/*
* Dada una frase y una palabra, busca cuantas veces aparece la palabra dentro de la frase.
*
* */

public class e07 {
    public static void main(String[] args) {
        String frase = "Hola me llamo Raquel y Hola estoy en clase";
        int cont =0;
        int pos=0;
        pos = frase.indexOf("Hola");

        while (pos!=-1){
            cont++;
            pos = frase.indexOf("Hola",pos+1);
        }
        System.out.print("La palabra aparece: "+cont+" veces");

    }
}
