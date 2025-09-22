package Boletin2_3;

public class CajaCarton extends Caja{
    public CajaCarton(int ancho, int alto, int fondo){
        super(ancho, alto, fondo,"cm");
    }
    @Override
    public double getVolumen(){
        return super.getVolumen()*0.8;
    }
    public double dameSuperficieTotal(){
        //area_superficial= 2*areadebase + arealareral
        double areaBase=ancho*fondo;
        double areaLateral=2*alto*ancho + 2*alto*fondo;
        return 2*areaBase+areaLateral;
    }
}
