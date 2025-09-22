package Boletin14;

public class Punto3D extends Punto{
    int z;
    public Punto3D(int x, int y, int z){
        super(x, y);
        this.z=z;
    }
    public double distancia(Punto3D otroPunto){
        return Math.sqrt(Math.pow(this.x-otroPunto.x,2)+Math.pow(this.y-otroPunto.y,2)+Math.pow(this.z-otroPunto.z,2));

    }
    @Override
    public boolean equals(Object o){
        boolean res=false;
        Punto3D otroPunto=(Punto3D) o;
        if (this.x==otroPunto.x && this.y==otroPunto.y && this.z==otroPunto.z){
            res=true;
        }
        return res;
    }
}
