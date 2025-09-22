//Escribe una funcion que decida si dos enteros positivos son amigos.
//a y b son amigos si la suma de los divisores propios de a es igual a b y viceversa.
//osea: divisores propios de a=b y divisores propios de b=a
//Divisores propio de a: son los que dividen  a "a" sin contar a.

public class e13 {
    public static void main(String[] args) {
        int a=24;
        int b =20;
        System.out.println("a y b son amigos: " + sonAmigos(a, b));

    }
    static boolean sonAmigos(int a, int b){
        boolean res = false;

        if (sumaDivisoresPropios(a) == b && sumaDivisoresPropios(b) == a)
            res = true;
        return res;
    }
    static int sumaDivisoresPropios(int n){
        int suma=0;
        for (int i=1; i<n; i++)
            if (n%i==0) suma +=i;
        return suma;
    }
}
