   public class e15corregido {
    public static void main(String[] args) {

        System.out.println("5 numero aleatorios entre 34 y 45");
   numerosAleatorios(5, 34, 45);
        System.out.println("---------------------------------");
        System.out.println("5 numero aleatorios entre 34 y 45");
   numerosAleatorios(10, 22, 35);
        System.out.println("---------------------------------");
   numerosAleatorios(10);


    }
   static void numerosAleatorios(int n, int min, int max){
       for (int i=1; i<=n; i++){
           //devuelve un valor positivo mayor igual que 0 y menor que 1 osea 0.999 periodico para que entre el ultimo nº hay que sumarle el 1
           System.out.println((int)(Math.random()*(max-min+1)+min));


       }
   }
   static void numerosAleatorios(int n){
       for (int i=1; i<=n; i++){
           System.out.println(Math.random());


       }
   }

}
