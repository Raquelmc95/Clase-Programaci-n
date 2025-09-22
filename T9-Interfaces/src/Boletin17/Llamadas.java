package Boletin17;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Llamadas implements Comparable{
    String tlfno;
    String interlocutor;
    boolean saliente;
    LocalDate fecha;
    LocalTime hInicio;
    LocalTime hFin;
    final int[] tabla={10,20,30,40,50};
    Zona zona;

    public Llamadas(String tlfno, String interlocutor, boolean saliente, int hInicio, int mInicio, int hFin, int mFin, String fecha, Zona zona){
        this.tlfno=tlfno;
        this.interlocutor=interlocutor;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fecha = LocalDate.parse(fecha, f);
        this.saliente=saliente;
        this.hInicio = LocalTime.of(hInicio, mInicio);
        this.hFin = LocalTime.of(hFin, mFin);
        this.zona=zona;
    }

    @Override
    public int compareTo(Object o) {
        Llamadas otrotlfno= (Llamadas) o;
        int res=tlfno.compareTo(otrotlfno.tlfno);
        if (res==0){
            res=fecha.compareTo(otrotlfno.fecha);
            if (res==0){
                res=hInicio.compareTo(otrotlfno.hInicio);
            }
        }


        return res;
    }
    public int minutosLlamadas(){
        return (int) hInicio.until(hFin, ChronoUnit.MINUTES);
    }
    public int coste(){
        int coste=0;
        if (saliente==true){
                if (zona.equals(Zona.Zona0)){
                    coste=minutosLlamadas()*tabla[0]/100;
                }else if (zona.equals(Zona.Zona1)) {
                    coste = minutosLlamadas() * tabla[1]/100;
                } else if (zona.equals(Zona.Zona2)) {
                    coste=minutosLlamadas()*tabla[2]/100;
                }else if (zona.equals(Zona.Zona3)) {
                    coste=minutosLlamadas()*tabla[3]/100;
                }else {
                    coste=minutosLlamadas()*tabla[4]/100;
                }
        }else {
            System.out.println("La llamada no es saliente");
        }
        return coste;
    }
    @Override

    public String toString(){
        return "Nº cliente: "+tlfno+" Nº interlocutor: "+interlocutor+" Fecha: "+fecha+" Hora Inicio: "+hInicio+" Duracion: "+minutosLlamadas()+" Coste: "+coste()+" cent/min"+"\n";
    }


}
