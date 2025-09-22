import java.util.Arrays;

public class e6boletin3corregido {
    public static void main(String[] args) {
        char c ='s';
        String frase ="Es viernes 13 tenemos examen de Programación";
        int [] pos = MyIndexOf(frase,c);
        System.out.println(Arrays.toString(pos));
    }

    static int[] MyIndexOf(String frase, char c) {
        int p[] = new int[0];
        int pos=0;
        boolean noEncontrado=false;

        do{
            pos = frase.indexOf(c, pos);
            if (pos!=-1){
                p=insercionNoOrdenada(p,pos);
                pos++;
            }else noEncontrado = true;
        }while (!noEncontrado);
        return p;
    }

    static int[] insercionNoOrdenada(int[] t, int n) {
        t=Arrays.copyOf(t,t.length+1);
        t[t.length-1]=n;
        return t;

    }

}
