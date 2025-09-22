import java.util.Arrays;

public class e6boletin6 {
    public static void main(String[] args) {
        String frase="Hola mundo";
        char c='H';
        char[]letras;
        letras=frase.toCharArray();
        System.out.println("Todas las posiciones del caracter c: "+Arrays.toString(busqueda(letras,c)));
    }

    static int[] busqueda(char[] letras, char c) {
        int t[]= new int[0];
        for (int i=0; i<letras.length; i++){
            if (letras[i]==c){
                t= Arrays.copyOf(t, t.length+1);
                t[t.length-1]=i;
            }
        }
        return t;

    }
}
