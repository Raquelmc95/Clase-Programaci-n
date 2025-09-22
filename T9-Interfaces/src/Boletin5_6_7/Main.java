package Boletin5_6_7;


public class Main {
    public static void main(String[] args) {
        //array de 5 futbolistas
        Futbolista[] tf=new Futbolista[5];
        tf[0]=new Futbolista("27455099","Pedro", 25, 0);
        tf[1]=new Futbolista("26455099","Enrique", 23, 5);
        tf[2]=new Futbolista("17455099","Manuel", 23, 10);
        tf[3]=new Futbolista("27454099","Luis", 30, 6);
        tf[4]=new Futbolista("25455099","Carlos", 24, 10);
        //creo dos socios
        Socio s1 = new Socio(1,"Pepido", "09-12-2000");
        Socio s2 = new Socio(2,"Pedro", "09-12-2010");

        //creo una cola de elementos Object
        Cola cola1 = new Lista();

        System.out.println("encolo el primer socio");
        cola1.encolar(s1);//encolo el primer socio
        for (Futbolista f:tf) cola1.encolar(f);//encolo los futbolitas
        System.out.println("encolo los futbolistas");
            cola1.encolar(s2);//encolo el segundo socio
            System.out.println("encolo el segundo socio");

            System.out.println("Muestro la cola");
            System.out.println(cola1);//muestro la cola
            System.out.println("desencolo, en este caso seria el primer socio");
            System.out.println(cola1.desencolar());//desencolo, n este caso seria el primer socio
            System.out.println("desencolo un futbolista");
            System.out.println(cola1.desencolar());//desencolo un futbolista

            System.out.println("Muestro la cola");
            System.out.println(cola1);//muestro cola

            System.out.println("---------------------------------");

            Pila pila1 = new Lista();
            Socio s3 = new Socio(2,"Pedro", "09-12-2010");
        for (Futbolista f:tf) pila1.apilar(f);
            pila1.apilar(s1);
            pila1.apilar(s2);
            pila1.apilar(s3);
            System.out.println(pila1);
            System.out.println(pila1.desapilar());
            System.out.println(pila1);


    }
}
