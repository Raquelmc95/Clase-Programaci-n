//Crea un programa que genere una secuencia de 20 numeros aleatorios enteros
//en el rango [5-10] y los muestre por pantalla.
//El requisito que debe cumplir la secuencia  es que no aparezcan dos numeros pares consecutivos.
//Para los nº aleatorios usar Math.Random()


public class e18 {
    public static void main(String[] args) {

        aleatorio(5,10);

    }

    static void aleatorio(int a, int b) {
        int cont = 1, nAleatorio, esPar=0;
            while (cont<=20){
                nAleatorio = a + (int)(Math.random()*(b-a+1));

                if (nAleatorio%2==0) esPar++;
                else esPar=0;

                if (esPar<2){
                    System.out.print(nAleatorio+ ", ");
                    cont++;
                }
            }
    }
}
