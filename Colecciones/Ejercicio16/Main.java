package Ejercicio16;

import java.util.*;

/*
* Los miembros de la real academia de la Lengua ocupan sillones con las Letras del abecedario español
* minusculas y mayusculas. Cuando un sillon queda vacante se nombra un nuevo academico para ocuparlo.
* Implementar la clase Academico, cuyos atributos son el nombre y el año de ingreso. El criterio
* de ordenacion natural será por nombres.
* Crear un programa donde se crean 5 objetos academicos que se insertan en un mapa en el que la clave
* es la letra del sillon que ocupan y el valor un objeto de la clase academico.
* Para ello implementar el metodo estatico:
* - static boolean nuevoAcademico (Map<Character, Academico> academia, Academico nuevo, Character letra)
* Donde se lleva a cabo la insercion despues de comprobar que el caracter es una letra del abecedario
* Hacer diversos listados de los academicos:
* -Por orden de nombre y de año de ingreso
* Debemos recordar que, en codigo Unicode, las mayusculas van antes que las minusculas
* */
public class Main {
    public static void main(String[] args) {
        //Con treemap tenemos un mapa ordenado por las claves (la letra),
        //donde vamos a inserta 5 academicos
        Scanner sc = new Scanner(System.in);
        Map<Character, Academico> academia = new TreeMap<>();
        for (int i=0; i<5; i++){
            System.out.print("Letra: ");
            Character letra = sc.next().charAt(0); //coge la primera letra si metes una palabra
            System.out.print("Nombre: ");
            String nombre = sc.next();
            System.out.print("Año ingreso: ");
            int ingreso = sc.nextInt();
            nuevoAcademico (academia, new Academico(nombre, ingreso), letra);
        }
        System.out.println("Orden por letra: "+academia);//ordenado por letra
        Collection<Academico> sinLetra = academia.values();//me duelve los valores que son el nombre y el año de ingreso y los mete en una coleccion generica
        List<Academico> listaSinLetra = new ArrayList<>(sinLetra);//los inserto en una lista
        Collections.sort(listaSinLetra);//los ordeno por nombre porque en academico hemos creado el comparato
        System.out.println("Orden por nombre sin letras: "+listaSinLetra);//los imprimos

        Comparator<Academico> comparaIngreso = new Comparator<Academico>() {
            @Override
            public int compare(Academico o1, Academico o2) {
                return o1.aIngreso-o2.aIngreso;
            }
        };
        Collections.sort(listaSinLetra, comparaIngreso);//le paso la lista sin letra y el comparador si no me lo compara
        //por nombre al tener el academico el comparato de nombre
        System.out.println("Orden por año sin letra: "+listaSinLetra);

    }

    static boolean nuevoAcademico(Map<Character, Academico> academia, Academico academico, Character letra) {
        boolean insertado = false;
        //si la letra se encuentra en este rango del abecedario se inserta en el mapa academia, el academico y la letra
        if (letra>='A' && letra<='Z' || letra>='a' && letra<='z' || letra == 'ñ' || letra == 'Ñ'){
            academia.put(letra, academico);
            insertado=true;
        }
        return insertado;

    }
}
