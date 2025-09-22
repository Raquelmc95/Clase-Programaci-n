package ejercicio4_5;

public class Violin extends Instrumento{
    public Violin(){
        super();

    }
    @Override
    public void interpretar(){
        for (Nota nota:melodia){
            switch (nota){
                case DO -> System.out.println("do...");
                case RE -> System.out.println("re...");
                case MI -> System.out.println("miiiii...");
                case FA -> System.out.println("fa...");
                case SOL -> System.out.println("sol...");
                case LA -> System.out.println("laaaaa...");
                case SI -> System.out.println("si...");
            }
        }
    }
}
