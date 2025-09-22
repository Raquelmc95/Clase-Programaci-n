package Ejercicio15;

import Ejercicio14.Registro;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path ="H:\\1- PROGRAMACION\\2º TRIMESTRE\\EJERCICIOS JAVAS\\T12-Colecciones\\src\\Ejercicio15\\";
        String filename="existencias.dat";
        Map<String, Integer> existencias = new TreeMap<>(); //ordena por la clave
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(path+filename))){
            existencias = (TreeMap<String, Integer>) in.readObject();

        }catch (FileNotFoundException ex){
            System.out.println("Archivo no encontrado...");
        }catch (IOException ex){
            System.out.println("Existencias vacias...");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        int opc =0;
        do {
            System.out.println("1. Alta producto");
            System.out.println("2. Baja producto");
            System.out.println("3. Cambio de stock producto");
            System.out.println("4. Listar existencias");
            System.out.println("5. Salir");
            System.out.println("Introduzca una opcion: ");
            opc = sc.nextInt();

            switch (opc){
                case 1 -> {
                    System.out.println("Código producto: ");
                    String codigo = sc.next();
                    //esto devuelve true o false
                    if (!existencias.containsKey(codigo)) existencias.put(codigo, 0);

                }
                case 2 -> {
                    System.out.println("Código producto: ");
                    String codigo = sc.next();
                    //esto devuelve el valor de la key o null si no existe
                    existencias.remove(codigo);

                }
                case 3 -> {
                    System.out.println("Código producto: ");
                    String codigo = sc.next();
                    System.out.println("Nuevo stock: ");
                    int stock = sc.nextInt();
                    existencias.put(codigo, stock);


                }
                case 4 ->{
                    System.out.println(existencias);

                }

            }
        }while (opc!=5);

        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path+filename));
            out.writeObject(existencias);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
