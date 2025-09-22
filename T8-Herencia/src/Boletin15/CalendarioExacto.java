package Boletin15;

public class CalendarioExacto extends Calendario{
    int hora, minuto;
    public CalendarioExacto(int dia, int mes, int anio, int hora, int minuto){
        super(dia, mes, anio);
        this.hora=0;
        this.minuto=0;
        if (hora>=0 && hora < 24){
            this.hora=hora;

        }
        if (minuto>=0 && minuto<60){
            this.minuto=minuto;
        }
    }
    public void incrementaHora(){
        hora++;
        if (hora>=23){
            hora=0;
        }
    }
    public void incrementaMinuto(){
        minuto++;
        if (minuto>=59){
            minuto=0;
            hora++;
        }
    }
    @Override
    public String toString(){
        return dia+"/"+mes+"/"+anio+" "+hora+":"+minuto;
    }
    @Override
    public boolean equals(Object o){
        boolean res=false;
        CalendarioExacto c = (CalendarioExacto) o;
        if (this.dia==c.dia && this.mes==c.mes && this.anio==c.anio && this.hora==c.hora && this.minuto==c.minuto){
            res=true;
        }
        return res;
    }
}
