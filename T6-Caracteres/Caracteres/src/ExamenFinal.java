import java.util.Arrays;

public class ExamenFinal {
    public static void main(String[] args) {
        int n = 17616;
        int[] bomboPremios = new int[1807];
        int[] bomboNumeros = new int[100000];
        int[][] premiados = new int[1807][2];
        int fRemover = 200;

        llenaBomboPremios(bomboPremios);
        llenaBomboNumeros(bomboNumeros);
        giraBombo(bomboPremios);
        giraBombo(bomboNumeros);

            for (int i = 0; i < premiados.length; i++) {
                fRemover--;
                if (fRemover == 0) {
                    giraBombo(bomboPremios);
                    giraBombo(bomboNumeros);
                }
                int premio = bomboPremios[0];
                bomboPremios[0] = bomboPremios[bomboPremios.length - 1];
                bomboPremios = Arrays.copyOf(bomboPremios, bomboPremios.length - 1);

                int numero = bomboNumeros[0];
                bomboNumeros[0] = bomboNumeros[bomboNumeros.length - 1];
                bomboNumeros = Arrays.copyOf(bomboNumeros, bomboNumeros.length - 1);
                premiados[i][0] = numero;
                premiados[i][1] = premio;
            }
        mostrarPremiosGrande(premiados);
        mostraPedrea(premiados);
    }

    static void mostraPedrea(int[][] p) {
        int columnas = 30;
        int [] pedrea = new int[0];
        System.out.println("Mostrar Pedrea....................");
        for (int i=0; i<p.length; i++){
            if (p[i][1] == 6){
                pedrea =Arrays.copyOf(pedrea, pedrea.length+1);
                pedrea[pedrea.length-1]=p[i][0];
            }
        }
        Arrays.sort(pedrea);
        for (int i=0; i<pedrea.length; i++){
           columnas--;
           if (columnas==0) {
               System.out.println();
               columnas=30;
           }
            System.out.print(pedrea[i]+", ");
        }
    }

    static void mostrarPremiosGrande(int[][] p) {
        for (int i=0; i<p.length; i++){
            switch (p[i][1]){
                case 1 -> System.out.println(p[i][0]+" GORDO!!!!");
                case 2 -> System.out.println(p[i][0]+" SEGUNDO PREMIO!!!!");
                case 3 -> System.out.println(p[i][0]+" TERCER PREMIO!!!!");
                case 4 -> System.out.println(p[i][0]+" CUARTO PREMIO!!!!");
                case 5 -> System.out.println(p[i][0]+" QUINTO PREMIO!!!!");

            }
        }
    }

    static void giraBombo(int[] b) {
        for (int i=0; i<b.length; i++){
            int ind1 = (int)(Math.random()*b.length);
            int ind2 = (int)(Math.random()*b.length);
            int aux = b[ind1];
            b[ind1]=b[ind2];
            b[ind2]=aux;

        }
    }

    static void llenaBomboNumeros(int[] b) {
        for (int i=0; i<b.length; i++){
            b[i]=i;
        }
    }

    static void llenaBomboPremios(int[] b) {
        b[0] =1;
        b[1] =2;
        b[2] =3;
        b[3] =4;
        b[4] =4;
        b[5] =5;
        b[6] =5;
        b[7] =5;
        b[8] =5;
        b[9] =5;
        b[10] =5;
        b[11] =5;
        b[12] =5;
        for(int i=13; i<b.length; i++){
            b[i]=6;
        }


    }
}
