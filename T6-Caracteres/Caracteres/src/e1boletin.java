import java.util.Scanner;

public class e1boletin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] meses = {"enero", "febrero", "marzo", "abril", "mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};

        System.out.println("Introduce un nº del mes del año: ");
        int mes = sc.nextInt()-1;

        for (int i=0; i<meses.length; i++){
            if (mes==i) System.out.println(meses[i]);
        }
    }
}
