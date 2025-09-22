package Ejercicio13;

import java.util.*;

public class Sorteo <T>{
    Set<T> elementos;

    public Sorteo(){
        elementos=new TreeSet<>();

    }
    boolean add (T nuevo){
        return elementos.add(nuevo);
    }
    Set<T> premiados(int numPremiados){//le paso que me saque un determinado numero de premiados de la lista temp
        Set<T> premiados = null;
        List<T> temp = new ArrayList<>(elementos);
        Collections.shuffle(temp); //shuffle me lo desordena aleatoriamente
        if (numPremiados<=elementos.size()){
            premiados=new TreeSet<>();
            for (int i=1; i<numPremiados; i++) premiados.add(temp.get(i));
        }
        return premiados;
    }

    @Override
    public String toString(){
        return "Sorteo: "+elementos;
    }
}
