
public class e04corregido {
    public static void main(String[] args) {
        int datos[] = {2, -3, 7, 10, 4};
        System.out.println("El máximo de la tabla es: "+max(datos));

    }

    static int max(int[] d) {
        int max = d[0]; //el 0 es la posicion del 2
        for (int e: d) if (e > max) max = e; //e toma los valores de d y hace un recorrido preguntando en el if por cada casilla
        //y si e es mayor que el max, e es el nuevo máximo
        return max;
    }
}
