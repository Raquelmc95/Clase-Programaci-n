package Boletin14;

public class Punto {
    int x, y;

    public Punto(int x, int y){
        this.x=x;
        this.y=y;
    }
    public double distancia(Punto otroPunto){
        return Math.sqrt(Math.pow(this.x - otroPunto.x, 2) + Math.pow(this.y - otroPunto.y, 2));
    }
    @Override
    public boolean equals(Object o){
        boolean res=false;
        Punto otroPunto=(Punto) o;
        if (this.x==otroPunto.x && this.y==otroPunto.y){
            res=true;
        }
        return res;
    }
}
