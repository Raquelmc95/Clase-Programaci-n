package Boletin12_13;

public class Rectangulo extends Poligono{
    public Rectangulo(double base, double altura){
        super(base, altura);
    }
    @Override
    public double area(){
        return base*altura;
    }
}
