package Ejercicio5;

import java.util.Arrays;

public class Lista {
    Integer [] tabla;

    public Lista(){
        tabla = new Integer[0];
    }
    public int numeroElementos(){
        return tabla.length;
    }
    public void insertaPrincipio(Integer nuevo){
        tabla = Arrays.copyOf(tabla, tabla.length+1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length-1);
        tabla[0] = nuevo;
    }
    static Lista concatena(Lista l1, Lista l2){
        Lista resultado=new Lista();
        for (Integer e:l1.tabla) resultado.insertaFinal(e);
        for (Integer e:l2.tabla) resultado.insertaFinal(e);
        return resultado;
    }
    public void insertaFinal(Integer nuevo){
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
    public void insertar(int pos, Integer nuevo){
        tabla=Arrays.copyOf(tabla, tabla.length+1);
        System.arraycopy(tabla, pos, tabla, pos+1, tabla.length-pos-1);
        tabla[pos]=nuevo;
        //es hacer un hueco en la posicion de la pos y copiar en la celda pos+1 los elementos demas elementos
        //en la nueva tabla
    }
    public Integer eliminar(int indice){
        Integer eliminado = null; //no es un entero, el Integer es una clase
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

    public Integer get(int indice){
        Integer resultado=null;
        if (0<=indice && indice<=tabla.length){
            resultado=tabla[indice];
        }
        return resultado;
    }
    public int buscar(Integer clave){
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
    public boolean equals(Object o){
        Lista otraLista = (Lista) o;
        boolean iguales=true;
        if (tabla.length==otraLista.tabla.length){
            for (int i=0; i<tabla.length && iguales; i++){//si ya es false sale del bucle para que no lo siga recorriendo
                if (!tabla[i].equals(otraLista.tabla[i])){
                    iguales=false;
                }
            }
        }else {
            iguales=false;
        }

        return iguales;

    }
}
