package Boletin4_5_6_7_8;

public class Cola extends Lista{
    public Cola(){
        super();
    }
    public void insertar(Integer nuevo){
        insertaFinal(nuevo);
    }
    public Integer Eliminar(){

        return eliminar(0);

    }
}
