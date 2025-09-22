import java.lang.reflect.Array;
import java.util.Arrays;

/*
* Crea una tabla de longitud 10 que se inicia con nº aleatorios entre el 1 y 100. Mostrar la suma de todos
* esos numeros.
* */
public class e01 {
    public static void main(String[] args) {
        int valores[];
        valores = new int[10];

        for (int i=0; i<valores.length; i++){
            valores[i] = (int) (Math.random()*100+1);
            System.out.println(valores[i]);
        }

        int suma =0;
        for (int valor : valores) {
            suma +=valor;
        }
        System.out.println("Suma: "+suma);
        System.out.println(valores);
        System.out.println(Arrays.toString(valores));

    }
}
