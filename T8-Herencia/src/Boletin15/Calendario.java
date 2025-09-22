package Boletin15;

public class Calendario {
    int dia;
    int mes;
    int anio;

    public Calendario(int dia, int mes, int anio){
        if (!esValida(dia, mes, anio)) {
            System.out.println("La fecha introducida no es valida");
        }else {
            this.dia=dia;
            this.mes=mes;
            this.anio=anio;
        }


    }

    private boolean esValida(int dia, int mes, int anio) {
        boolean res=true;
        if (dia<=0 || dia>31 || mes<=0 || mes>12 || anio==0) {
            res=false;
        }
        return res;
    }

    void incrementarDia(){
        if (dia==31 || dia==28){
            dia=1;
        }else if(dia==30 && mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
            dia++;
        }else{
            dia++;
        }
    }
    void incrementarMes(){
        if (mes<=0 || mes>12){
            System.out.println("El mes introducido no es correcto");
        }else if (mes==12){
            mes=1;

        }else if(dia==31 && mes==1){
            dia=28;
            mes++;
        }else if (dia==31 && mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
            dia=30;
            mes++;
        }else {
            mes++;
        }

    }
    void incrementarAnio(int cantidad){
        if (anio==0){
            System.out.println("El año introducido no es correcto");
        }else {
            anio+=cantidad;
        }

    }
    void mostar(){
        System.out.println(dia+"/"+mes+"/"+anio);

    }
    boolean iguales(Calendario otrafecha){
        boolean res=false;
        if (this.dia==otrafecha.dia && this.mes==otrafecha.mes && this.anio==otrafecha.anio) {
            res = true;
        }
        return res;
    }
}
