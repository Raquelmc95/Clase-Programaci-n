package Boletin14;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;

public class Jornada implements Comparable {
    String dni;
    LocalDate fecha;
    LocalTime checkin;
    LocalTime checkout;

    public Jornada(String dni, String fecha, int horaIn, int minutoIn, int horaOut, int minutoOut) {
        this.dni = dni;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fecha = LocalDate.parse(fecha, f);
        this.checkin = LocalTime.of(horaIn, minutoIn);
        this.checkout = LocalTime.of(horaOut, minutoOut);


    }
    public int minutosTrabajados(){
        return (int) checkin.until(checkout, ChronoUnit.MINUTES);
    }
    @Override
    public int compareTo(Object o){
        int res=0;
        Jornada otrajornada = (Jornada) o;
        if (dni.equals(otrajornada.dni)){
            if (fecha.isAfter(otrajornada.fecha)){
                res=1;
            } else if (fecha.isBefore(otrajornada.fecha)) {
                res=-1;

            } else if (fecha.isEqual(otrajornada.fecha)) {
                res=0;

            }
        }else {
            res=dni.compareTo(otrajornada.dni);
        }
        return res;
    }
    @Override
    public String toString(){
        return "Dni: "+dni+" Fecha: "+fecha+ " Duracion jornadas: "+minutosTrabajados()+"\n";

    }
}
