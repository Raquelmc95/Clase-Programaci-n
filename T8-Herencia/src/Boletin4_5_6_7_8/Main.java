package Boletin4_5_6_7_8;

public class Main {
    public static void main(String[] args) {
        Lista l1 =new Lista();
        Lista l2 =new Lista();

        l1.insertaFinal(4);
        l1.insertaFinal(5);
        l1.insertaFinal(6);
        System.out.println(l1);

        l1.insertaPrincipio(3);
        l1.insertaPrincipio(2);
        l1.insertaPrincipio(1);
        System.out.println(l1);

        l1.insertar(2,99);
        System.out.println(l1);

        l1.eliminar(2);
        System.out.println(l1);
        System.out.println(l1.buscar(4));
        System.out.println(l1.get(3));

        l2.insertaFinal(10);
        l2.insertaFinal(20);
        l2.insertaFinal(30);
        l2.insertaFinal(40);
        l2.insertaFinal(50);
        System.out.println(l2);

        l1.insertaFinal(l2);
        System.out.println(l1);

        System.out.println(Lista.concatena(l1,l2));

        Lista l3=new Lista();
        l3.insertaFinal(1);
        l3.insertaFinal(2);
        l3.insertaFinal(3);
        l3.insertaFinal(4);
        l3.insertaFinal(5);
        l3.insertaFinal(6);
        l3.insertaFinal(10);
        l3.insertaFinal(20);
        l3.insertaFinal(30);
        l3.insertaFinal(40);
        l3.insertaFinal(50);
        System.out.println(l1.equals(l3));

        System.out.println("--------------------------------------");
        System.out.println("Clase PILA");
        Pila p = new Pila();
        p.insertarPush(1);
        p.insertarPush(2);
        p.insertarPush(3);
        p.insertarPush(4);
        p.insertarPush(5);
        p.insertarPush(6);
        p.insertarPush(7);
        p.insertarPush(8);
        p.insertarPush(9);
        p.insertarPush(10);
        System.out.println(p.toString());


        System.out.println(p.EliminarPop());
        System.out.println(p.EliminarPop());
        System.out.println(p.EliminarPop());
        System.out.println(p.toString());
        System.out.println(p.EliminarPop());
        System.out.println(p.EliminarPop());
        System.out.println(p.EliminarPop());
        System.out.println(p.toString());
        System.out.println(p.EliminarPop());
        System.out.println(p.EliminarPop());
        System.out.println(p.EliminarPop());
        System.out.println(p.EliminarPop());
        System.out.println(p.EliminarPop());
        System.out.println(p.EliminarPop());

        System.out.println("--------------------------------------");
        System.out.println("Clase COLA");
        Cola c =new Cola();
        c.insertar(1);
        c.insertar(2);
        c.insertar(3);
        c.insertar(4);
        c.insertar(5);
        c.insertar(6);
        System.out.println(c.toString());
        System.out.println(c.Eliminar());
        System.out.println(c.Eliminar());
        System.out.println(c.Eliminar());
        System.out.println(c.Eliminar());
        System.out.println(c.Eliminar());
        System.out.println(c.Eliminar());
        System.out.println(c.Eliminar());
        System.out.println(c.toString());

        System.out.println("--------------------------------------");
        System.out.println("Clase CONJUNTO");
        Conjunto c1=new Conjunto();
        Conjunto c2=new Conjunto();
        Conjunto c3=new Conjunto();
        Conjunto c4=new Conjunto();

        c1.inserta(1);
        c1.inserta(2);
        c1.inserta(3);
        c1.inserta(4);
        c1.inserta(5);
        System.out.println("c1: "+c1);

        c2.inserta(4);
        c2.inserta(5);
        c2.inserta(8);
        c2.inserta(9);
        c2.inserta(10);
        System.out.println("c2: "+c2);

        c3.inserta(1);
        c3.inserta(2);
        System.out.println("c3: "+c3);

        System.out.println("c4: "+c4);
        c4.insertaConjunto(c3);
        System.out.println("Inserta c3 en c4: "+c4);
        System.out.println("c1 incluido en c2: "+Conjunto.incluido(c1,c2));
        System.out.println("c3 incluido en c1: "+Conjunto.incluido(c3,c1));
        System.out.println("c1 union c2: "+Conjunto.union(c1,c2));
        System.out.println("c1 interseccion c2: "+Conjunto.interseccion(c1,c2));
        System.out.println("c1 menos c2: "+Conjunto.diferencia(c1,c2));
    }

}
