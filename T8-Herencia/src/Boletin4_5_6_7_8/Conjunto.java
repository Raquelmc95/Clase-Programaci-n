package Boletin4_5_6_7_8;

public class Conjunto extends Lista{
    public Conjunto(){
        super();
    }
    static boolean incluido(Conjunto c1, Conjunto c2){
        boolean res=true;
        for (Integer e:c1.tabla){//se puede hacer con el otro for añadiendo && res
            if (!c2.pertenece(e)){
                res=false;
                break;
            }
        }
        return res;
    }
    static Conjunto union(Conjunto c1, Conjunto c2){
        Conjunto c3 = new Conjunto();
        c3.insertaConjunto(c1);
        c3.insertaConjunto(c2);
        return c3;
    }
    static Conjunto interseccion(Conjunto c1, Conjunto c2){//elementos comunes en los dos
        Conjunto c3 = new Conjunto();
        for (Integer e:c1.tabla){
            if (c2.pertenece(e)){
                c3.inserta(e);
            }
        }

        return c3;
    }
    static Conjunto diferencia(Conjunto c1, Conjunto c2){//elementos no comunes
        Conjunto c3 = new Conjunto();
        for (Integer e:c1.tabla){
            if (!c2.pertenece(e)){
                c3.inserta(e);
            }
        }
        return c3;
    }

    public boolean inserta(Integer nuevo){
        boolean res=false;
        if (buscar(nuevo)==-1){
            insertaFinal(nuevo);
            res=true;
        }

        return res;
    }
    public boolean insertaConjunto(Conjunto otroConjunto){
        boolean res=false;
        for (Integer e:otroConjunto.tabla){
            if (!pertenece(e)){
                inserta(e);
                res=true;
            }
        }
        return res;
    }
    public boolean elimina(Integer n){
        boolean res=false;
        int indice=buscar(n);
        if (buscar(indice)!=-1){
            eliminar(indice);
            res=true;
        }
        return res;
    }
    public boolean eliminaConjunto(Conjunto otroConjunto){
        boolean res=false;
        for (Integer e:otroConjunto.tabla){
            if (pertenece(e)){
                elimina(e);
                res=true;

            }
        }
        return res;
    }


}
