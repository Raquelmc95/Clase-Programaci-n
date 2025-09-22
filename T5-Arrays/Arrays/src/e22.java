import java.util.Arrays;

public class e22 {
    public static void main(String[] args) {
        int[] t={2,3,2,6,3};

        System.out.println("Tabla sin repetidos");
        System.out.println(Arrays.toString(sinrepetidos(t)));
    }

    static int[] sinrepetidos(int[] t) {
        int aBuscar;
        for (int i=0; i<t.length; i++){
            aBuscar=t[i];
            for (int j=1; j<t.length; j++){
                if (t[j]==aBuscar) {
                    t[j] = t[t.length - 1];
                    t = Arrays.copyOf(t, t.length - 1);
                }
            }
        }
        return t;
    }
}
