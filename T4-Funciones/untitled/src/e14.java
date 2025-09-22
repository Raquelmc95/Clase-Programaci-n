//Crea una funcion que se le pasa horas y minutos de dos instantes de tiempo
//con el siguiente prototipo:
//static int diferenciaMin(int h1, int n1, int h2, int n2)
//La funcion devuelve la cantidad de minutos que hay entre esos dos instantes
//h1 = 5 m1=10 y h2=6 m2=10

public class e14 {
    public static void main(String[] args) {
        int h1=23;
        int m1=10;
        int h2=1;
        int m2=10;

        System.out.print(+diferenciaMin(h1, m1, h2, m2));

    }
    static int diferenciaMin(int h1, int m1, int h2, int m2){
        int cont;

        if (h1>h2) h2 +=24;
        cont = (h2*60+m2) - (h1*60 + m1);

        return cont;
    }
}
