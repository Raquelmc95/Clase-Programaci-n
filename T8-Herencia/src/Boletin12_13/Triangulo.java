package Boletin12_13;

public class Triangulo extends Poligono{
    public Triangulo(double base, double altura){
        super(base,altura);
    }
    @Override
    public double area(){
        return base*altura/2;
    }
}
