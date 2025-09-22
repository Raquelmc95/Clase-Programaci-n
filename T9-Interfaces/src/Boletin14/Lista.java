package Boletin14;

import Boletin5_6_7.Cola;
import Boletin5_6_7.Pila;

import java.util.Arrays;
import java.util.Comparator;

public class Lista implements Cola, Pila {
    Object [] tabla;

    public Lista(){
        tabla = new Object[0];
    }
    public int numeroElementos(){
        return tabla.length;
    }
    public void insertaPrincipio(Object nuevo){
        tabla = Arrays.copyOf(tabla, tabla.length+1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length-1);
        tabla[0] = nuevo;
    }
    static Lista concatena(Lista l1, Lista l2){
        Lista resultado=new Lista();
        for (Object e:l1.tabla) resultado.insertaFinal(e);
        for (Object e:l2.tabla) resultado.insertaFinal(e);
        return resultado;
    }
    public void insertaFinal(Object nuevo){
        tabla = Arrays.copyOf(tabla, tabla.length+1);
        tabla[tabla.length-1]=nuevo;
    }
    public void insertaFinal(Lista otraLista){
        int tamIni = tabla.length;
        tabla = Arrays.copyOf(tabla, tabla.length+otraLista.tabla.length);
        //es una copia de la tabla con la longitud de esa tabla mas la longitud de la tabla de la otra lista
        //y la copia las casillas vacias
        System.arraycopy(otraLista.tabla, 0, tabla, tamIni, otraLista.tabla.length);
        //De una tabla copio esos valores en la nueva tabla creada desde donde termina la primera tabla
        //hasta donde termina la segunda tabla en la nueva tabla

    }
    public void insertar(int pos, Object nuevo){
        tabla=Arrays.copyOf(tabla, tabla.length+1);
        System.arraycopy(tabla, pos, tabla, pos+1, tabla.length-pos-1);
        tabla[pos]=nuevo;
        //es hacer un hueco en la posicion de la pos y copiar en la celda pos+1 los elementos demas elementos
        //en la nueva tabla
    }
    public Object eliminar(int indice){
        Object eliminado = null; //no es un entero, el Integer es una clase
        if (indice >=0 && indice < tabla.length){
            eliminado = tabla[indice];
            for (int i=indice+1; i< tabla.length; i++){
                tabla[i-1]=tabla[i];
            }
            tabla=Arrays.copyOf(tabla, tabla.length-1);
        }
        return eliminado;
    }
    //El integer envuelve al int y convierte un entero en binario en decimal, en muchas cosas

    public int buscar(Object clave){
        int indice =-1;
        for (int i=0; i< tabla.length; i++){
            if (tabla[i].equals(clave)){
                indice=i;

            }
        }
        return indice;
    }
    @Override
    public String toString(){
        return "Lista: "+Arrays.toString(tabla);
    }

    @Override
    public void encolar(Object nuevo) {
        insertaFinal(nuevo);
    }

    @Override
    public Object desencolar() {
        return eliminar(0);
    }

    @Override
    public void apilar(Object nuevo) {
        insertaFinal(nuevo);
    }


    @Override
    public Object desapilar() {
        return eliminar(numeroElementos()-1);
    }
    void ordenar(){
        Arrays.sort(tabla);

    }
    void ordenar(Comparator c){
        boolean mismoTipo=true;
        String tipo = tabla[0].getClass().getName();
        for (Object o:tabla) if (!tipo.equals(o.getClass().getName())) mismoTipo=false;
        if (mismoTipo) Arrays.sort(tabla,c);
        else System.out.println("No son del mismo tipo.....");

    }
}
