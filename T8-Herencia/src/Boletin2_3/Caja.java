package Boletin2_3;

public class Caja {
    int ancho;
    int alto;
    int fondo;
    Unidad unidad;
    String etiqueta;

    public Caja(int ancho, int alto, int fondo, String unidad){
        this.ancho=ancho;
        this.alto=alto;
        this.fondo=fondo;
        this.unidad=Unidad.valueOf(unidad);

    }
    public double getVolumen(){
        double volumen;
        volumen=ancho*alto*fondo;
        if (unidad.toString().equals("cm")){//la unidad la paso a cadena porque cm es una cadena
            volumen/=100;
            return volumen;
        }
        return volumen;
    }
    public void setEtiqueta(String etiqueta){//hacer comprobaciones si es mayor que 30 como indica el ejercicio
        this.etiqueta=etiqueta;
    }
    @Override
    public String toString(){
        return "alto: "+alto+", ancho: "+ancho+", fondo: "+fondo+", unidad: "+unidad+" y TAG: "+etiqueta;
    }
}
