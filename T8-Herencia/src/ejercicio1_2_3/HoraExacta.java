package ejercicio1_2_3;

public class HoraExacta extends Hora {
    protected int segundo;

    public HoraExacta(int hora, int minuto, int segundo){
        super(hora, minuto);
        if (!setSegundo(segundo)){
            System.out.println("Segundo incorrecto");
        }

    }

    public boolean setSegundo(int segundo) {
        boolean correcto = false;
        if (0<= segundo && segundo<60) {
            correcto=true;
            this.segundo=segundo;
        }

        return correcto;
    }
    @Override
    public String toString(){
        String res=super.toString();
        res+=":"+segundo;
        return res;
    }
    @Override
    public boolean equals(Object o){ //puedo enviar lo que quiera si utilizo Object, en este caso es una hora
        HoraExacta otroReloj =(HoraExacta) o;
        boolean iguales;
        if (this.hora == otroReloj.hora && this.minuto == otroReloj.minuto && this.segundo == otroReloj.segundo){
            iguales=true;
        }else {
            iguales=false;
        }
        return iguales;
    }


}
