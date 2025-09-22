public class e21corregido {
    public static void main(String[] args) {
        char[][] matriz = new char[10][10];
        char c ='*';

        matriz = rellenaDePuntos(matriz, c);
        imprimeMatriz (matriz);
        System.out.println();

        int x=1, y=1,lado=3;
        char car ='@';
        insertaCuadrado(matriz,x,y,lado,car);
        imprimeMatriz (matriz);
    }

    static void insertaCuadrado(char[][] matriz, int x, int y, int lado, char car) {
        int lm=matriz.length;
        for (int i=0; i<lado; i++){
            for (int j=0; j<lado; j++){
                if (i==0||i==lado-1||j==0||j==lado-1){ //para un triangulo hay que cambiar esta parte
                    matriz[(x+i)%lm][(y+j)%lm]=car;

                }
            }
        }
    }

    static void imprimeMatriz(char[][] m) {
        for (char [] fila:m) {
            for (int i = 0; i < fila.length; i++) {
                System.out.print(fila[i]+" ");
            }
            System.out.println();
        }
    }

    static char[][] rellenaDePuntos(char[][] m, char c) {
        for (char [] fila:m) {
            for (int i = 0; i < fila.length; i++) {
                fila[i] = c;
            }
        }
        return m;
    }
}
