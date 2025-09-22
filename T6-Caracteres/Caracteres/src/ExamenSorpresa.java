import java.util.Scanner;


public class ExamenSorpresa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intento=10;

        System.out.println("Teclea frase secreta: ");
        String fraseSecreta = sc.nextLine();

        String palabra="";
        for (int i=0; i<fraseSecreta.length(); i++) palabra += ("_");
        palabra = calculaAciertos(fraseSecreta,palabra,' ');
        imprime(palabra);

        while (intento>0&&!fraseSecreta.equals(palabra)){
            System.out.println("Tiene "+intento+ " intentos, teclee una letra: ");
            String letra = sc.next();
            String aux = palabra;
            palabra = calculaAciertos(fraseSecreta,palabra,letra.charAt(0));
            imprime(palabra);
            if (aux.equals(palabra)) intento--;
        }

        if (fraseSecreta.equals(palabra)) System.out.println("YOU WIN");

    }

    static String calculaAciertos(String fraseSecreta, String palabra, char c) {
      char letra [] = palabra.toCharArray();
      for (int i=0; i<fraseSecreta.length(); i++){
          if (fraseSecreta.charAt(i) == c) letra[i]= c;
      }
      return String.valueOf(letra);
    }
    static void imprime(String f){
        for (int i=0; i<f.length(); i++){
            System.out.print(f.charAt(i)+" ");
        }
    }
}
