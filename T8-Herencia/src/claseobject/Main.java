package claseobject;

public class Main {
    public static void main(String[] args) {
        Object a ="Luis";
        System.out.println(a.getClass());
        System.out.println(a.getClass().getName());

        Object b= Double.valueOf(3.5); //me dice que lo hay dentro del parentisis es un double
        Class clase = b.getClass();
        System.out.println(clase.getName());//double
        Class superClase = clase.getSuperclass();
        System.out.println(superClase.getName());//Number
        Class supersuperClase = clase.getSuperclass().getSuperclass();
        System.out.println(supersuperClase.getName());//Object
    }
}
