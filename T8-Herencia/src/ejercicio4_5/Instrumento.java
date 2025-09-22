package ejercicio4_5;

import java.util.Arrays;

public abstract class Instrumento {//No se puede instanciar objetos de una clase abstracta
    protected Nota[] melodia;

    public Instrumento(){
        melodia= new Nota[0];
    }
    void addNota(Nota n){
        melodia= Arrays.copyOf(melodia, melodia.length+1);
        melodia[melodia.length-1]=n;

    }
    abstract void interpretar();//si el metodo es abstracto la clase tiene que ser abstracta
    }
