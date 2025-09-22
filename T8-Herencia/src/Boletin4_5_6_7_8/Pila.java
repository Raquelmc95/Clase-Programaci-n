package Boletin4_5_6_7_8;

import javax.swing.plaf.PanelUI;

public class Pila extends Lista{
    public Pila(){
        super();
    }
    public void insertarPush(Integer nuevo){
        insertaFinal(nuevo);
    }
    public Integer EliminarPop(){

        return eliminar(numeroElementos()-1);

    }

}
