package Boletin20;

public class barajas implements Comparable{
    int numero;
    String palo;

    public barajas(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public static void dameCarta() {
        int numero=1 + (int) (Math.random() * 6);
        String[] palos = {"basto", "espada", "oro", "copa"};
        int indice = (int) (Math.random() * palos.length);
        System.out.println("El " + numero + " de " + palos[indice]);
    }
    public String toString(){
        return "numero: "+numero+", palo: "+palo+"\n";
    }

    @Override
    public int compareTo(Object o) {
        int res=palo.compareTo(((barajas)o).palo);
        return res;
    }
}