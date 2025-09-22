package ejercicio4_5;

public class Main {
    public static void main(String[] args) {
        Nota cancion[]={Nota.DO, Nota.RE, Nota.FA,Nota.DO, Nota.RE, Nota.FA};
        Piano p=new Piano();
        for (Nota nota: cancion){
            p.addNota(nota);
        }
        p.interpretar();

        System.out.println("--------------------------------");

        Violin v=new Violin();
        for (Nota nota: cancion){
            v.addNota(nota);
        }
        v.interpretar();


    }
}
