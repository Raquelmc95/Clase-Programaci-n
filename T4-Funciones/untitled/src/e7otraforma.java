import java.util.Scanner;

public class e7otraforma {
    static boolean es_primo (int num){
        boolean primo;
        int i;
        primo = true;

        i=2;
        while (i<num && primo == true){
            if (num%i == 0) primo = false;
            i++;
        }
        return (primo);
    }
    static int num_divisores (int num){
        int cont;
        cont = 1;
        for (int i=2; i<=num; i++)
            if (es_primo(i) && num%i == 0)
                cont++;

        return (cont);
    }

    public static void main(String[] args) {
        int num, div;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce nº: ");
        num = sc.nextInt();
        div = num_divisores(num);

        System.out.println("Tiene " +div+ " divisores");
    }
}
