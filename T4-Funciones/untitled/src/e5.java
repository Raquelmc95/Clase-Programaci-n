//Crea una funcion que devuelve un booleano que indica si el caracter
//que se le pasa como parametro corresponde a una vocal

public class e5 {
    public static void main(String[] args) {
        System.out.println("La i es una vocal: "+esVocal('i'));
        System.out.println("La e es una vocal: "+esVocal('e'));
        System.out.println("La c es una vocal: "+esVocal('c'));
        System.out.println("La d es una vocal: "+esVocal('d'));
        System.out.println("La a es una vocal: "+esVocal('a'));



    }

    static boolean esVocal(char c) {
        boolean res;
        if (c=='a' || c=='e' ||c=='i' ||c=='o' ||c=='u'||c=='A' || c=='E' ||c=='I' ||c=='O' ||c=='U') res = true;
        else res = false;
        return res;
    }

}
