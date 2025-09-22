package Ejercicio11;

import java.io.*;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
* Implementa la clase Socio con atributos dni, nombre y fecha de alta, y metodos, equals(), la interfaz comparable
* basada en el dni y el metodo de antiguedad().
* Implementa un programa que gestione los socios de un club guardando los datos en el fichero datos.dat
* */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path="D:\\1- PROGRAMACION\\2º TRIMESTRE\\EJERCICIOS JAVAS\\T12-Colecciones\\src\\Ejercicio11\\";
        String filename="datos.dat";

        Set<Socio> socios = new TreeSet<>();

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(path+filename))){
            socios=(TreeSet<Socio>) in.readObject();
        }catch (FileNotFoundException e){
            System.out.println("Fichero no encontrado....");
        }catch (IOException e){
            System.out.println("Lista de socios vacia....");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        int opc =0;
        do {
            System.out.println("1. Alta");
            System.out.println("2. Baja");
            System.out.println("3. Modificacion");
            System.out.println("4. Listado por dni");
            System.out.println("5. Listado por antiguedad");
            System.out.println("6. Salir");
            System.out.println("7. Introduzca opcion: ");
            opc = sc.nextInt();

            switch (opc){
                case 1 -> {
                    System.out.println("Dni: ");
                    String dni = sc.next();
                    alta(socios, dni);

                }
                case 2 -> {
                    System.out.println("Dni: ");
                    String dni = sc.next();
                    socios.remove(new Socio(dni));
                }
                case 3 -> {
                    System.out.println("Dni: ");
                    String dni = sc.next();
                    socios.remove(new Socio(dni));//lo elimino
                    alta(socios, dni);//y le doy de alta otra vez
                }
                case 4 -> {
                    System.out.println(socios);
                }
                case 5 -> {
                    Comparator<Socio> c = new Comparator<Socio>() {
                        @Override
                        public int compare(Socio o1, Socio o2) {
                            return o1.antiguedad()-o2.antiguedad();
                        }
                    };
                    Set<Socio> s = new TreeSet<>(c);//le paso el comparator
                    s.addAll(socios);//y le añado el conjunto de socio
                    System.out.println(s);
                }
            }
        }while (opc!=6);

        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path+filename));
            out.writeObject(socios);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    private static boolean alta(Set<Socio> socios, String dni) {
        System.out.print("Nombre: ");
        String nombre = new Scanner(System.in).next();
        System.out.println("Fecha alta: ");
        String alta = new Scanner(System.in).next();

        Socio nuevo = new Socio(dni, nombre, alta);

        return socios.add(nuevo);
    }
}
