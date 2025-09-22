package ejercicio1_2_3;

public class Hora {
    protected int hora, minuto;

    public Hora(int hora, int minuto){
        this.hora = 0;
        this.minuto=0;
        if (!setHora(hora)){
            System.out.println("Hora incorrecta");
        }
        if (!setMinuto(minuto)){
            System.out.println("Minuto incorrecto");
        }
    }
    public void inc(){
        minuto++;
        if (minuto>59){
            minuto=0;
            hora++;
            if (hora>23){
                hora=0;
            }
        }
    }

    public boolean setHora(int hora) {
        boolean correcto = false;
        if (0<= hora && hora<24) {
            correcto=true;
            this.hora=hora;
        }

        return correcto;
    }
    public boolean setMinuto(int minuto) {
        boolean correcto = false;
        if (0<= minuto && minuto<60) {
            correcto=true;
            this.minuto=minuto;
        }

        return correcto;
    }
    @Override
    public String toString(){
        String res;
        res=hora+":"+minuto;
        return res;
    }
}
