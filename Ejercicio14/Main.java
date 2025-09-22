package Ejercicio14;

import Ejercicio11.Socio;

import java.io.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

/*
* Crea un programa que simule el registro de las temperaturas, a lo largo de un dia en una estacion meteorologica. Mostrara
* un menu con las opciones:
* 1. Nuevo registro
* 2. Listar registros
* 3. Mostrar estadisticas (maximo, minimo y promedio de las temperaturas)
* 4. Salir
* Al salir los datos se guardan en un fichero binario con la fecha al final pe: registros20250217.dat
* Cada registro constará de la temperatura en grados centigrados y la hora, que se lee del sistema en el momento de la
* creacion del registro
* */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        /*String path="D:\\1- PROGRAMACION\\2º TRIMESTRE\\EJERCICIOS JAVAS\\T12-Colecciones\\src\\Ejercicio14\\";
        String filename="registros.dat";*/
        Set<Registro> temperaturas = new LinkedHashSet<>();

        /*try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(path+filename))){
            temperaturas=(LinkedHashSet<Registro>) in.readObject();
            System.out.println(temperaturas);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }*/

        int opc =0;
        do {
            System.out.println("1. Nuevo registro");
            System.out.println("2. Listar registro del dia");
            System.out.println("3. Mostrar estadisticas");
            System.out.println("4. Salir");
            System.out.println("Introduzca una opcion: ");
            opc = sc.nextInt();

            switch (opc){
                case 1 -> {
                    System.out.println("Introducir temperatura: ");
                    double temp = sc.nextDouble();
                    temperaturas.add(new Registro(temp));

                }
                case 2 -> {
                    System.out.println(temperaturas);

                }
                case 3 -> {
                    Comparator<Registro> c = new Comparator<Registro>() {
                        @Override
                        public int compare(Registro o1, Registro o2) {
                            return (int) Math.signum(o1.temperatura-o2.temperatura); //esto devuelve 1 o -1 hace lo mismo que el return
                        }
                    };
                    System.out.println("Maxima: "+Collections.max(temperaturas,c));
                    System.out.println("Minima: "+Collections.min(temperaturas,c));
                    double suma = 0;
                    for (Registro t:temperaturas)suma+=t.temperatura;
                    System.out.println("Media: "+suma/temperaturas.size());

                }

            }
        }while (opc!=4);

        String path="D:\\1- PROGRAMACION\\2º TRIMESTRE\\EJERCICIOS JAVAS\\T12-Colecciones\\src\\Ejercicio14\\";
        String filename="registros";

        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyyMMdd");
        filename=filename+ LocalDateTime.now().format(f)+".dat";

        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path+filename));
            out.writeObject(temperaturas);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
