import java.util.Locale;
import java.util.Scanner;

//Crear una funcion que calcule a^n, donde a es real y n es un entero no negativo
// Hacerlo con la version iterativa y con una recursiva
public class e10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.print("Teclee base (real): ");
        double base = sc.nextDouble();
        System.out.print("Teclee exponentee (int): ");
        int exp = sc.nextInt();

        double res = aElevadoNIterativa(base, exp);

        System.out.print("El resultado es "+res);
    }

    static double aElevadoNIterativa(double b, int n) {
        double res = 1;
        for (int i=1; i<=n; i++) res = res * b;
        return res;
    }
    static double aElevadoNRecursiva(double b, int n) {
        double res;
        if (n==0) res = 1;
        else res = b*aElevadoNRecursiva(b,n-1); //3*3^3-1/3*3^2-1/3*3^1-1//
        return res;
    }

}
