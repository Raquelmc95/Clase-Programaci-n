//Dado dos nº a y b mostrar el mcd (el nº mas grande que divide a ambos). Una forma de calcularlo seria
//ir buscando de forma decreciente el primer numero que divide a los dos.
//Realiza una funcion que devuelva el int mcd (int a, int b) con valores 20 y 15 el max es 5.
public class e19corregido {
    public static void main(String[] args) {
        System.out.println("El mcd es: "+ macd(20,15, 30));

    }

   static int macd(int a, int b, int c) {


        boolean encontrado = false;
        int menor = minimo(a,minimo(b,c));
        int mcd = menor;

        while (!encontrado &&  menor != 1){
            if (a%mcd ==0 && b%mcd ==0 && c%mcd==0) encontrado = true;
            else mcd--;
        }
        return mcd;
    }

    static int minimo(int a, int b){
        int min;
        if (a>b) min=b;
        else min=a;
        return min;
    }

}
