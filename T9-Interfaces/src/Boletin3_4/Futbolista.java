package Boletin3_4;

public class Futbolista implements Comparable{
    String dni;
    String nombre;
    int edad;
    int numGoles;

    public Futbolista(String dni, String nombre, int edad, int numGoles){
        this.dni=dni;
        this.nombre=nombre;
        this.edad=edad;
        this.numGoles=numGoles;
    }
    @Override
    public String toString(){
        return "Dni: "+dni+" Nombre: "+nombre+" Edad: "+edad+" NumGoles: "+numGoles+"\n";
    }
    @Override
    public boolean equals(Object otro){
        Futbolista otroFutbolista = (Futbolista) otro;
        return dni.equals(otroFutbolista.dni);
    }

    @Override
    public int compareTo(Object otro) {
        Futbolista otroFutbolista = (Futbolista) otro;
        return dni.compareTo(otroFutbolista.dni);
    }
}

