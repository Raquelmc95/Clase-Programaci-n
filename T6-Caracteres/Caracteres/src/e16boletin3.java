import java.util.Arrays;

public class e16boletin3 {
    public static void main(String[] args) {
        String frase="En un lugar de la mancha de cuyo nombre no quiero acordarme";
        String[] palabras=frase.split(" ");
        String fraseOrdenada="";
        Arrays.sort(palabras);
        System.out.println(Arrays.toString(palabras));
        for (String palabra:palabras) fraseOrdenada+=palabra+" ";
        System.out.println(fraseOrdenada);
    }
}
