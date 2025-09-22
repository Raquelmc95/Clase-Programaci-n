/*
* Dado un Nombre muestralo sin vocales mayusculas, minusculas y acentuadas
* */

public class e06 {
    public static void main(String[] args) {
        String nombre = "Enrique Tierno Galván";
        String nombresSinVocales ="";
        char c;
        for (int i=0; i<nombre.length(); i++){
            c = nombre.charAt(i);
            if (!esVocal(c)) nombresSinVocales+=c;
        }
        System.out.println(nombresSinVocales);

    }

    static boolean esVocal(char c) {
        boolean res = false;
        String vocales = "aeiouAEIOUáéíóú";
        c = Character.toLowerCase(c);//te cambia las mayusculas a minusculas y las minusculas a minusculas
        if (vocales.indexOf(c)!=-1) res=true; //indexof te busca c en vocales si esta res es true
        return res;
    }
}
