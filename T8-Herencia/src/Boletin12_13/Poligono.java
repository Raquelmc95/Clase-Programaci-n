package Boletin12_13;

abstract class Poligono {
    protected double base, altura;

    public Poligono(double base, double altura){
        this.base=base;
        this.altura=altura;

    }
    abstract double area();
}
