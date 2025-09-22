package Ejercicio02;
/*
* Crear, con tipos genericos, la clase Contenedor donde podremos guardar tantos objetos
* como deseemos. Para esto usaremos una tabla, que de inicio su tamaño es 0 y se irá redimensionando
* con inserciones y borrados de elementos. La clase, además del constructor y toString tiene los
* siguientes metodos:
* - void insertarAlPrincipio(T nuevo)
* - void insertarAlFinal(T nuevo)
* - T extraerDelPrincipio()
* - T extraerDelFinal()
* - void ordenar()
* */
public class Main {
    public static void main(String[] args) {
        Contenedor<Integer> c = new Contenedor<>(new Integer[0]);//le pasamos al constructor un arrays de Integer
        for (int i=0; i<20; i++){
            c.insertarAlFinal((int)(Math.random()*20));
        }
        System.out.println("Sin ordenar: "+c);
        c.ordenar();
        System.out.println("Ordenado: "+c);
        Integer e = c.extraerDelPrincipio();
        System.out.println("Elemento extraido: "+e);
        System.out.println("Despues de extraer"+c);


    }
}
