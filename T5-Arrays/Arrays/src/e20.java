/*
* Tenemos un mapa que se implementa como una matriz. Si desde el lugar x podemos llegar al lugar y, entonces
* matriz [x][y] es true, en caso contrario vale false.
* Escribe una funcion que indique si es posible viajar de x a y (directamente o pasando por lugares intermedios).
* */

import java.lang.reflect.Array;
import java.util.Arrays;

public class e20 {
    public static void main(String[] args) {
        int numPuntos=10;
        int[][] caminos ={{1,3},{2,1},{2,3},{0,2},{0,8},{7,4},{5,4},{5,9},{4,9}};
        boolean [][] mapa= getMapa(caminos,numPuntos);
        int[][] vecinos = getVecinos(mapa);
        int origen =1, destino =6;
        int[] visitados = new int[0];

        System.out.println("Hay camino: "+hayCamino(vecinos, origen, destino, visitados));
        System.out.println(Arrays.deepToString(vecinos));


    }

    static boolean hayCamino(int[][] vecinos, int origen, int destino, int[] v) {
        boolean res = false;
        v = insercionNOrdenada(v,origen);
        if (vecinos.length > 0){
            //comprueba conexion directa del origen con el estilo
            for (int i=0; i<vecinos[origen].length; i++){
                if (vecinos[origen][i] == destino){
                    System.out.println("Camino: "+origen);
                    res = true;
                }
            }
            //si no comprueba conexion de los vecinos del origen con el destino
            if (!res){
                for (int i=0; i<vecinos[origen].length; i++){
                    if (!fueVisitado(v, vecinos[origen][i])) {
                        if (hayCamino(vecinos, vecinos[origen][i], destino, v)) {
                            System.out.println("Camino: " + origen);
                            res = true;
                        }
                    }
                }
            }
        }

        return res;
    }

    static boolean fueVisitado(int[] v, int n) {
        boolean visitado = false;
        int i=0;
        while (i<v.length && !visitado){
            if (v[i]==n) visitado = true;
            i++;

        }
        return visitado;
    }

    static int[][] getVecinos(boolean[][] mapa) {
        int [][] c = new int[mapa.length][0];
        for (int i=0; i< mapa.length; i++){
            for (int j=0; j< mapa[i].length; j++){
                if (mapa[i][j]) c[i]= insercionNOrdenada(c[i],j); //si hay camino de i a j hace una insercion no ordenada
            }
        }
        return c;
    }

    static int[] insercionNOrdenada(int[] t, int n) {
        t=Arrays.copyOf(t, t.length+1);
        t[t.length-1]=n;
        return t;
    }

    static boolean[][] getMapa(int[][] caminos, int numPuntos) {
        boolean [][] m = new boolean[numPuntos][numPuntos];
        for (int i=0; i<numPuntos; i++) m[i][i]=true;  //diagonal
        for (int i=0; i<caminos.length; i++){
            m[caminos[i][0]][caminos[i][1]]=true; //aqui esta diciendo que de 1 a 3 o de 3 a 1 es true
            m[caminos[i][1]][caminos[i][0]]=true;
        }
        for (boolean[] booleans: m){
            for (int j=0; j<m[0].length; j++){ //m[...],[...],[...] m[0] es la primera matriz
                if (booleans[j]) System.out.print("1 "); //esto imprime cada fila
                else System.out.print("- ");
            }
            System.out.println(); //un salto de linea en cada fila
        }
        System.out.println();

        return m;
    }
}
