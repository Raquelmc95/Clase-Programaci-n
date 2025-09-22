//Escribe una funcion que muestre una seria de numeros aleatorios.
//Los parametros de la funcion son la cantidad de numeros que se mostraran y los valores
//max y min que estos pueden tomar.
//Ej: numerosAleatorios(5, 34, 45) muestra 5 numeros aleatorios todos entre el 34 y el 45

public class e15 {
    public static void main(String[] args) {
        int a =5;
        int b=30;
        int c=50;

        System.out.println("5 numero aleatorios entre 34 y 45");

        numerosAleatorios(a, b, c);
    }
    static void numerosAleatorios(int n, int min, int max){
        for (int i=1; i<=n; i++){
            int numerosecreto = (int)(Math.random()*(max-min+1)+min); //devuelve un valor positivo mayor igual que 0 y menor que 1 osea 0.999 periodico para que entre el ultimo nº hay que sumarle el 1
            System.out.print(+numerosecreto+ " ,");


        }
    }

}
