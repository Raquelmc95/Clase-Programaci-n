package Boletin12;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable {//Sirve para ordenar listas que no son de integer
    int identificador;
    String nombre;
    LocalDate fechaNacimiento;

    public Socio(int identificador, String nombre, String fechaNacimiento){
        this.identificador=identificador;
        this.nombre=nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaNacimiento=LocalDate.parse(fechaNacimiento,f);
    }
    public int edad(){
        return (int)fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }
    /*
    @Override
    public int compareTo(Object o) { //es una interfaz definida de java, le vamos a enviar una clase como parametro
        //para ordenar la lista que le pasamos como parametros
        int resultado=0;
        Socio otrosocio = (Socio) o;
        if (edad()<otrosocio.edad()){
            resultado=-1;
        } else if (edad()>otrosocio.edad()){
            resultado=1;

        }else if(edad()==otrosocio.edad()){
            if(identificador<otrosocio.identificador){
                resultado=-1;

            } else if (identificador>otrosocio.identificador) {
                resultado=1;

            }else {
                resultado=0;
            }
        }
        return resultado;
    }*/
    public String toString(){
        return "id:"+identificador+" Nombre:"+nombre+" Edad:"+edad()+" FechaNac:"+fechaNacimiento+"\n";
    }

    /*@Override
    public int compareTo(Object otronombre) {

        return nombre.compareTo(((Socio)otronombre).nombre);//esto devuelve 1, -1 o 0 segun la comparacion y lo ordena alfabeticamente
    }*/
    /*
    @Override
    public int compareTo(Object fecha){
        Socio otrafecha= (Socio) fecha;
        return fechaNacimiento.compareTo(otrafecha.fechaNacimiento);

    }*/
    @Override
    public int compareTo(Object o){
        int res;
        Socio otrosocio=(Socio) o;
        if (fechaNacimiento.isBefore(otrosocio.fechaNacimiento)){
            res=-1;
        } else if (fechaNacimiento.isAfter(otrosocio.fechaNacimiento)) {
            res=1;
        }else {
            res=0;
        }
        return res;
    }

}

