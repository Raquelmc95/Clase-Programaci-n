package Ejercicio03;

import java.util.Arrays;

public class Contenedor<T> implements Pila<T>{
    private T[] objetos;

    public Contenedor(T[] objetos){
        this.objetos=objetos;
    }
    void insertarAlFinal(T nuevo){
        objetos = Arrays.copyOf(objetos, objetos.length+1);
        objetos[objetos.length-1]=nuevo;
    }
    void insertarAlPrincipio(T nuevo){
        objetos = Arrays.copyOf(objetos, objetos.length+1);
        System.arraycopy(objetos, 0, objetos, 1, objetos.length-1); //desde el 0 hasta length-1 los copio a partir de la posicion 1 al final en el hueco que hemos hecho
        objetos[0]=nuevo;
    }
    T extraerDelFinal(){
        T res = null;
        if (objetos.length>0){//si existen elementos
            res = objetos[objetos.length-1];
            objetos=Arrays.copyOf(objetos,objetos.length-1);
        }
        return res;
    }
    T extraerDelPrincipio() {
        T res = null;
        if (objetos.length>0) {
            res = objetos[0];
            objetos = Arrays.copyOfRange(objetos, 1, objetos.length);
        }
        return res;
    }
    void ordenar(){
        Arrays.sort(objetos);//por su orden natural se hace asi por el tipo que le pasemos
    }
    public String toString(){
            return Arrays.toString(objetos);
    }

    @Override
    public void apilar(T nuevo) {
        insertarAlFinal(nuevo);
    }

    @Override
    public T desapilar() {
        return extraerDelFinal();
    }
}
