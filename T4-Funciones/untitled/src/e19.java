//Dado dos nº a y b mostrar el mcd (el nº mas grande que divide a ambos). Una forma de calcularlo seria
//ir buscando de forma decreciente el primer numero que divide a los dos.
//Realiza una funcion que devuelva el int mcd (int a, int b) con valores 20 y 15 el max es 5.
public class e19 {
    public static void main(String[] args) {
        System.out.println("El mcd es: "+ macd(20,30));

    }

    static int macd(int a, int b) {
        int mayor = a>b? a:b;
        int menor = a>b? b:a;

        boolean encontrado = false;

        int mcd = menor;

        while (!encontrado &&  menor != 1){
            if (mayor%mcd ==0 && menor%mcd ==0) encontrado = true;
            else mcd--;
        }
        return mcd;
    }


}
