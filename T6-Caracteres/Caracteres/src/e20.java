import java.util.Arrays;
import java.util.Scanner;

public class e20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        String [] agenda={};
        do {
            System.out.print("Teclee (I)nsertar/(E)liminar/(M)odificar/(L)istar/(C)alculos/(S)alir: ");
            String opc= sc.next().toUpperCase();
            opc=String.valueOf(opc.charAt(0));
            switch (opc){
                case "I" ->{
                    agenda=inserta(agenda);
                    System.out.println("Registro añadido....");
                }
                case "E" ->{
                    agenda=elimina(agenda);

                }
                case "M" ->{
                    agenda=modifca(agenda);
                    System.out.println("Registro modificado....");
                }
                case "L" ->{
                    lista(agenda);

                }
                case "C" ->{
                    calculos(agenda);

                }
                case "S" -> salir = true;
                default -> {
                    System.out.println("Opcion erronea....");

                }
            }
        }while (!salir);
    }

    static void calculos(String[] a) {
        int numH=0, numM=0, edadMasJoven=1000, edadMasViejo=-1000, sumaEdad=0, sumaEdadH=0, sumaEdadM=0;
        float edadMedia, edadMediaH, edadMediaM;
        String empleadoMasJoven="", empleadoMasViejo="";
        for (String registro : a){
            String [] campos = registro.split(":");
            int edad = Integer.parseInt(campos[1]);
            if (campos[3].equals("F")){
                numM++;
                sumaEdadM += Integer.parseInt(campos[1]);

            }else {
                numH++;
                sumaEdadH += Integer.parseInt(campos[1]);
            }
            if (edad<=edadMasJoven){
                edadMasJoven=edad;
                empleadoMasJoven = campos[0];
            }
            if (edad>=edadMasViejo){
                edadMasViejo=edad;
                empleadoMasViejo=campos[0];
            }
        }

        System.out.println("Empleado mas joven: "+empleadoMasJoven+" que tiene "+edadMasJoven);
        System.out.println("Empleado mas viejo: "+empleadoMasViejo+" que tiene "+edadMasViejo);

        edadMedia = (sumaEdadM+sumaEdadH)/(numM+numH);
        edadMediaH = sumaEdadH/numH;
        edadMediaM = sumaEdadM/numM;
        System.out.println("Edad media de los empleados: "+edadMedia);
        System.out.println("Edad media de las empleadas femeninas: "+edadMediaM);
        System.out.println("Edad media de los empleados masculinos: "+edadMediaH);
    }

    static String[] modifca(String[] a) {
        int ant = a.length;
        a = elimina(a);
        if (a.length<ant) a=inserta(a);
        return a;
    }

    static String[] elimina(String[] a) {
        Scanner sc = new Scanner(System.in);
        int pos=0; boolean encontrado = false;
        System.out.print("Nombre: ");
        String nombre = sc.next();
        for (String registro: a){
            pos= registro.indexOf(nombre);
            if (pos!=-1){
                a[pos] = a[a.length-1];
                a = Arrays.copyOf(a, a.length-1);
                System.out.println("Registro eliminado....");
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("Nombre no encontrado.......");
        return a;
    }

    static void lista(String[] a) {
        for (String registro : a){
            String [] campos = registro.split(":");
            for (String campo: campos) System.out.println(campo);
            System.out.println("------------------------");

        }
    }

    static String[] inserta(String[] a) {
        String nombre, cargo, sexo;
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        nombre = sc.next();
        System.out.print("Cargo: ");
        cargo = sc.next();
        System.out.print("Sexo(M/F): ");
        sexo = String.valueOf(sc.next().charAt(0)).toUpperCase();
        System.out.print("Edad: ");
        edad = sc.nextInt();
        String registro = nombre+":"+edad+":"+cargo+":"+sexo;
        a = inserionNoOrdenada(a, registro);

        return a;

    }

    static String[] inserionNoOrdenada(String[] t, String n) {
        t = Arrays.copyOf(t, t.length+1);
        t[t.length-1]=n;
        return t;
    }
}
